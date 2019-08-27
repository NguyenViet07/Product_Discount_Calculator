import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float Price = Float.parseFloat(request.getParameter("price"));
        float Discount = Float.parseFloat(request.getParameter("Percent"));
        double Amount = Price*Discount*0.01;
        float Discount_Price = (float) (Price - Amount);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<h3>Product Description: " + description + "</h1>");
        writer.println("<h3>Price: " + Price+ "</h1>");
        writer.println("<h3>Discount Percent: " + Discount+ "</h1>");
        writer.println("<h3>Discount Amount: " + Amount+ "</h1>");
        writer.println("<h3>Discount Price: " + Discount_Price+ "</h1>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
