package productdetail;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/product"})
public class ProductDetails extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Welcome to product</h1>");
        out.print("<form action='saveproduct' form >");
        out.print("<label for='ProductId'> ProductId:</label><br>");
        out.print("<input type='text' name='productId' required><br><br>");
        out.print("<label for='ProductName'> ProductName:</label><br>");
        out.print("<input type='text' name='productName'><br><br>");
        out.print("<label for='ProductPrice'> ProductPrice:</label><br>");
        out.print("<input type='text' name='productPrice'><br><br>");
        out.print("<label for='ProductQuantity'> ProductQuantity:</label><br>");
        out.print("<input type='text' name='productQuantity' value='0'><br><br>");
        out.print("<input type='submit' value='Submit'>&nbsp;&nbsp;&nbsp;");
        out.print("<button><a href='showproduct'> Show table </a></button>");
        out.print("</form>");
    }
}
