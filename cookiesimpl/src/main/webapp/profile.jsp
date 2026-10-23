<html>
  <title>Profile Page</title>
<body>
<h2>Profile Page</h2>

<h2>Welcome! <%= session.getAttribute("username")%></h2>
    <h3>
  <a href="home.jsp">Home</a>
  <a href="about.jsp">About</a>
</h3>

</body>
</html>
