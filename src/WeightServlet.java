import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WeightServlet")
public class WeightServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            // Получаем значения параметров weight и planet из запроса
            String weightParam = request.getParameter("weight");
            String planetParam = request.getParameter("planet");

            // Переменные для веса и выбранной планеты
            double weight = 0;
            Planet selectedPlanet = null;

            // Пытаемся преобразовать значение параметра weight в число
            try {
                if (weightParam != null) {
                    weight = Double.parseDouble(weightParam);
                }
            } catch (NumberFormatException e) {
                // Если произошла ошибка преобразования, сообщаем об ошибке
                out.println("<html><head><title>Error</title></head><body>");
                out.println("<h1>Error: Invalid input for weight</h1>");
                out.println("</body></html>");
                return;
            }

            // Пытаемся найти выбранную планету
            try {
                if (planetParam != null) {
                    selectedPlanet = Planet.valueOf(planetParam);
                }
            } catch (IllegalArgumentException e) {
                // Если произошла ошибка, сообщаем об ошибке
                out.println("<html><head><title>Error</title></head><body>");
                out.println("<h1>Error: Invalid input for planet</h1>");
                out.println("</body></html>");
                return;
            }

            // Вычисляем вес на выбранной планете
            double weightOnSelectedPlanet = selectedPlanet.surfaceWeight(weight);

            // Выводим результат на экран
            out.println("<html><head><title>Weight on Different Planets</title></head><body>");
            out.println("<h1>Your weight on " + selectedPlanet + " is " + weightOnSelectedPlanet + " kg</h1>");
            out.println("</body></html>");
        }
    }
}
