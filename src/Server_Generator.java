import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class Server_Generator {
    private static final int MAX_QUOTES_PER_USER = 5;
    private static final int MAX_CLIENTS = 10;
    private static final Map<String, String> userCredentials = new HashMap<>();
    private static final Map<String, Integer> userQuotesCount = new ConcurrentHashMap<>();
    private static final Set<String> connectedClients = new HashSet<>();

    private static List<String> quotes = Arrays.asList(
            "Жизнь — это то, что с тобой происходит, пока ты строишь планы.",
            "Если ты не можешь сделать что-то великое, сделай хотя бы что-то хорошее.",
            "Счастье — это когда то, что ты думаешь, что ты, совпадает с тем, кем ты являешься на самом деле.",
            "Будьте сами собой, все остальные роли уже заняты.",
            "Жизнь не предлагает подарков. Она предлагает возможности.",
            "Неудачи — это возможность начать снова, но уже более мудро.",
            "Если ты хочешь изменить мир, начни с себя.",
            "Трудности — это лестница, по которой поднимаются те, кто не боится их преодолеть.",
            "Секрет счастья — это свобода, секрет свободы — смелость.",
            "Всякий раз, когда ты встречаешь преграду, помни, что это преграда, а не стена."
    );

    static {
        userCredentials.put("user1", "password1");
        userCredentials.put("user2", "password2");

    }

    public static void main(String[] args) {
        System.setProperty("console.encoding", "UTF-8");
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Сервер запущен. Ожидание подключений...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                if (connectedClients.size() < MAX_CLIENTS) {
                    new ClientHandler(clientSocket).start();
                } else {
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    out.println("Сервер перегружен. Попробуйте позже.");
                    clientSocket.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket clientSocket;
        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }
        public void run() {
            try {
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String clientAddress = clientSocket.getInetAddress().getHostAddress();
                System.out.println("Новое подключение от " + clientAddress);

                String username = authenticateUser(in, out);

                if (username != null) {
                    int userQuoteCount = userQuotesCount.getOrDefault(username, 0);

                    while (userQuoteCount < MAX_QUOTES_PER_USER) {
                        String inputLine = in.readLine();
                        if (inputLine.equals("exit")) {
                            break;
                        }

                        int randomIndex = new Random().nextInt(quotes.size());
                        String randomQuote = quotes.get(randomIndex);
                        out.println(randomQuote);

                        userQuoteCount++;
                        userQuotesCount.put(username, userQuoteCount);
                    }

                    if (userQuoteCount >= MAX_QUOTES_PER_USER) {
                        out.println("Достигнуто максимальное количество цитат для пользователя. Соединение завершено.");
                    }
                }

                connectedClients.remove(username);

                System.out.println(clientAddress + " отключился.");
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private String authenticateUser(BufferedReader in, PrintWriter out) throws IOException {
            out.println("Введите имя пользователя:");
            String username = in.readLine();
            out.println("Введите пароль:");
            String password = in.readLine();

            if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
                connectedClients.add(username);
                return username;
            } else {
                out.println("Неверные имя пользователя или пароль. Соединение завершено.");
                clientSocket.close();
                return null;
            }
        }
    }
}
