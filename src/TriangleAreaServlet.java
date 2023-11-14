import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/triangle-area")
public class TriangleAreaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            // Получаем значения параметров a, b, c из запроса
            String aParam = request.getParameter("a");
            String bParam = request.getParameter("b");
            String cParam = request.getParameter("c");

            // Переменные для сторон треугольника
            double a = 0;
            double b = 0;
            double c = 0;

            // Пытаемся преобразовать значения параметров в числа
            try {
                if (aParam != null) {
                    a = Double.parseDouble(aParam);
                }
                if (bParam != null) {
                    b = Double.parseDouble(bParam);
                }
                if (cParam != null) {
                    c = Double.parseDouble(cParam);
                }
            } catch (NumberFormatException e) {
                // Если произошла ошибка преобразования, сообщаем об ошибке
                out.println("<html><head><title>Error</title></head><body>");
                out.println("<h1>Error: Invalid input for a, b, or c</h1>");
                out.println("</body></html>");
                return;
            }

            // Проверяем, чтобы сумма любых двух сторон была больше третьей
            if (a + b <= c || a + c <= b || b + c <= a) {
                out.println("<html><head><title>Error</title></head><body>");
                out.println("<h1>Error: Triangle with given sides does not exist</h1>");
                out.println("</body></html>");
                return;
            }

            // Вычисляем полупериметр
            double s = (a + b + c) / 2;

            // Вычисляем площадь треугольника по формуле Герона
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Выводим площадь треугольника на экран
            out.println("<html><head><title>Triangle Area</title></head><body>");
            out.println("<h1>Triangle Area: " + area + "</h1>");
            out.println("</body></html>");
        }
    }
}
