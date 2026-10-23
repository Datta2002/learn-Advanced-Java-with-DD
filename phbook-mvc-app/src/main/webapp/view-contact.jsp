<%@ page import="java.util.*" %>
<%@ page import="phbook.dto.Contact" %>
<html>
<body>
<%@ include file='menu.jsp' %>

<%
    List<Contact> contacts = (List<Contact>) request.getAttribute("contactList");
%>
<div class="container mt-3">
 <h2>Contact List</h2>
  <table class="table table-hover">
    <thead class="table-success ">
      <tr>
        <th>Name</th>
        <th>Contact Number</th>
        <th>Blocked</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
      <%
          for(Contact ct : contacts ) {
      %>
              <tr>
                  <td><%= ct.getName() %></td>
                  <td><%= ct.getPhNumber() %></td>
                  <td><%= ct.isBlocked()? "Yes" :"No" %></td>
                  <td>
                    <a href="edit-contact?id=<%= ct.getId() %>">
                      <span class="glyphicon glyphicon-edit"></span>
                    </a>
                     <a href="delete-contact?id=<%= ct.getId() %>">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
              </tr>
      <%
              }
      %>
    </tbody>
  </table>
</div>


</body>
</html>
