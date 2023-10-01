import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String serverResponse;
            while ((serverResponse = in.readLine()) != null) {
                if (serverResponse.equals("Достигнуто максимальное количество цитат для пользователя. Соединение завершено.") ||
                        serverResponse.equals("Сервер перегружен. Попробуйте позже.")) {
                    System.out.println(serverResponse);
                    break;
                }

                System.out.println("Получено: " + serverResponse);
                System.out.print("Жду следующую цитату (или введите 'exit' для выхода): ");

                String userInputLine = userInput.readLine();
                if (userInputLine.equals("exit")) {
                    break;
                }

                out.println(userInputLine);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
