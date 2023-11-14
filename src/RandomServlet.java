import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/random")
public class RandomServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String minParam = request.getParameter("min");
            String maxParam = request.getParameter("max");


            int min = 0;
            int max = 1000;


            try {
                if (minParam != null) {
                    min = Integer.parseInt(minParam);
                }
                if (maxParam != null) {
                    max = Integer.parseInt(maxParam);
                }
            } catch (NumberFormatException e) {
                out.println("<html><head><title>Error</title></head><body>");
                out.println("<h1>Error: Invalid input for min or max</h1>");
                out.println("</body></html>");
                return;
            }

            if (min > max) {
                out.println("<html><head><title>Error</title></head><body>");
                out.println("<h1>Error: min should not be greater than max</h1>");
                out.println("</body></html>");
                return;
            }

            int randomNumber = new Random().nextInt((max - min) + 1) + min;

            out.println("<html><head><title>Random Number</title></head><body>");
            out.println("<h1>Random Number: " + randomNumber + "</h1>");
            out.println("</body></html>");
        }
    }
}
