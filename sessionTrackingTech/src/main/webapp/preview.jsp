<html>
    <title>Preview Details</title>
    <body>
        <h2>Preview Details</h2>
        <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String collegename = request.getParameter("collegename");
            String branchname = request.getParameter("branchname");
        %>
        <p><strong>Name:</strong> <%= name %></p>
        <p><strong>Email:</strong> <%= email %></p>
        <p><strong>Phone:</strong> <%= phone %></p>
        <p><strong>College Name:</strong> <%= collegename %></p>
        <p><strong>Branch Name:</strong> <%= branchname %></p>

           <h1> <a href="save?name=<%=name%>&email=<%=email%>&phone=<%=phone%>&collegename=<%=collegename%>&branchname=<%=branchname%>">Save Details</a></h1>
     </body>
</html>
