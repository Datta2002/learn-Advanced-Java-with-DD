package phbook.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import phbook.dto.Contact;
import phbook.model.ContactModel;

import java.io.IOException;

@WebServlet("/new-contact")
public class SaveContact extends HttpServlet  {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String contact = req.getParameter("contact");
        String blocked = req.getParameter("blocked");
        boolean blockFlag = blocked != null; // block is null = false, block not null = true

        Contact contactObject = new Contact();
        contactObject.setName(name);
        contactObject.setPhNumber(contact);
        contactObject.setBlocked(blockFlag);

        ContactModel contactModel = new ContactModel();
        boolean result = contactModel.save(contactObject);
        String mesage = result ? "created" : "fail";
        resp.sendRedirect("new-contact.jsp?msg="+mesage);

    }
}
