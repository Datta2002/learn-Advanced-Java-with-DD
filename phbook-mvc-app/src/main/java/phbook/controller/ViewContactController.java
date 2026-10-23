package phbook.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import phbook.dto.Contact;
import phbook.model.ContactModel;

import java.io.IOException;
import java.util.List;

@WebServlet("/get-all-contact")
public class ViewContactController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ContactModel model = new ContactModel();
        List<Contact> contacts =  model.getAll();

        req.setAttribute("contactList", contacts);
        RequestDispatcher rd = req.getRequestDispatcher("view-contact.jsp");
        rd.forward(req, resp);
    }
}
