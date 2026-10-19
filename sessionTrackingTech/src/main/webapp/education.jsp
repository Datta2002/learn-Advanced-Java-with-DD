<html>
<head>
    <title>Educational Details</title>
</head>
<body>
<h2>Educational Details</h2>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
%>

<form action="preview.jsp">
        <input type=hidden name="name" value="<%= name %>">
        <input type=hidden name="email" value="<%= email %>">
        <input type=hidden name="phone" value="<%= phone %>">
    Enter College Name :
    <input type="text" name="collegename"><br><br>

    Enter Branch Name :
    <input type="text" name="branchname"><br><br>

    <button type="submit">Check Preview</button>
    </form>
</body>
</html>
