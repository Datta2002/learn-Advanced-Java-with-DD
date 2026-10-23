package phbook.model;

import phbook.dto.Contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ContactModel {

    public boolean save(Contact contact) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava2912","root","root");
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO phbook(name,phnumber,blocked,createdon) VALUES(?,?,?,CURRENT_TIMESTAMP)");
            stmt.setString(1, contact.getName());
            stmt.setString(2, contact.getPhNumber());
            stmt.setBoolean(3, contact.isBlocked());
            int count = stmt.executeUpdate();
            result = count>0;
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // SonarLint/SonarQube - Code Review Tool
    public List<Contact> getAll() {
        List<Contact> contactList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava2912","root","root");
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM phbook");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Contact ct = new Contact();
                ct.setId(rs.getInt("id"));
                ct.setName(rs.getString("name"));
                ct.setPhNumber(rs.getString("phnumber"));
                ct.setBlocked(rs.getBoolean("blocked"));
                ct.setCreatedOn(rs.getString("createdon"));
                contactList.add(ct);
            }
            connection.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return contactList;
    }




}
