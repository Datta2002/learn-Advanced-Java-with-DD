<html>
<body>
<h2>Cookies Example</h2>
 <%
     Cookie[] cookies = request.getCookies();
     String previousUsername = null;
     if (cookies != null) {
         for (Cookie cookie : cookies) {
             if ("username".equals(cookie.getName())) {
                 previousUsername = cookie.getValue();
                 break;
             }
         }
     }
 %>

<h2>Welcome, <%= (previousUsername != null) ? previousUsername : "Guest" %></h2>

<form action="cookie">
  <input type="text" name="username"><br><br>>
  <button type="submit">Submit</button>
</body>
</html>
