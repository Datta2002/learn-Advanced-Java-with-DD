package calculator;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/displayresult"})
public class DisplayResult extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        int firstNumber = Integer.parseInt(req.getParameter("firstNumber"));
        int secondNumber = Integer.parseInt(req.getParameter("secondNumber"));
        String selectedOption = req.getParameter("selectedOption");
        int result = 0;
        switch (selectedOption) {
            case "addition" :
                result = firstNumber + secondNumber;
                break;
            case "substraction" :
                result = firstNumber - secondNumber;
                break;
            case "multiplication" :
                result = firstNumber * secondNumber;
                break;
            case "division" :
                result = firstNumber / secondNumber;
                break;
            case "modulus" :
                result = firstNumber % secondNumber;
                break;
            default :
                out.print("<h2>Please check input !! ");
        }

        out.print("<h1>" + selectedOption + " Of " + firstNumber + " & " + secondNumber + " is : " + result + "</h1>");
    }
}

