<html>
  <title>Home Page</title>
<body>
<h2>Home Page</h2>

<h2>Welcome! <%= session.getAttribute("username")%></h2>
<h2>Welcome! <%= session.getAttribute("JSESSIONID")%></h2>

<h3>
  <a href="profile.jsp">Profile</a>
  <a href="about.jsp">About</a>
  <a href="logout">Logout</a>
</h3>

</body>
</html>
