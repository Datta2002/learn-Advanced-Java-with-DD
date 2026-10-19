<html>
<body>
<h2>Hell Form INTRO JSP page</h2>
<h3> this is JSP tech.</h3>

 <%!
   void m1(){
      System.out.println("Hello from decl tag !");
   }

  %>

<%
  for (int i=0; i<5; i++){ %>
     <h3> <%= i %></h3>
 <%
  }
%>

<% m1();%>
</body>
</html>
