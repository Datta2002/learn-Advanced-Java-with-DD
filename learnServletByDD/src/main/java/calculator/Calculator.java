package calculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/calci"})
public class Calculator extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Welcome to Calculator</h1>");
        out.print("<form action='displayresult' form >");
        out.print("<label for='FirstNumber'> Enter First Number :&nbsp; &nbsp; &nbsp;</label>");
        out.print("<input type='number' name='firstNumber'><br><br>");
        out.print("<label for='SecondNumber'> Enter Second Number :&nbsp; &nbsp; &nbsp;</label>");
        out.print("<input type='number' name='secondNumber'><br><br>");
        out.print("<label for='DropDown'> Select the Operation :&nbsp; &nbsp; &nbsp;</label>");
        out.print("<select id='myDropdown' name='selectedOption'>");
        out.print("<option value='addition'>Add</option>");
        out.print("<option value='substraction'>Sub</option>");
        out.print("<option value='multiplication'>Mul</option>");
        out.print("<option value='division'>Div</option>");
        out.print("<option value='modulus'>Mod</option>");
        out.print("</select><br><br>");
        out.print("<input type='submit' value='Submit'>");
        out.print("</form>");
    }
}