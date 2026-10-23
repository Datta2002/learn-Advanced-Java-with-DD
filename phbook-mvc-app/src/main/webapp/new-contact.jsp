<html>
<body>

<%@ include file='menu.jsp' %>

<div class="container mt-3">
  <h2>Add New Contact</h2>

  <%
        String msg = request.getParameter("msg");
         String msgClass = "";
         String msgValue = "";
         if(msg != null) {
            switch(msg) {
                case "created":
                    msgClass = "alert alert-success";
                    msgValue = "Contact Created Successfully..";
                    break;
                case "fail":
                    msgClass = "alert alert-danger";
                    msgValue = "Fail to Created Contact..";
                    break;
            }
         }
  %>

    <div class="<%=msgClass%>">
        <strong><%=msgValue%> </strong>
    </div>

  <form action="new-contact">
    <div class="mb-3 mt-3">
      <label for="name">Name :</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
    </div>
    <div class="mb-3">
      <label for="contact">Contact :</label>
      <input type="text" class="form-control" id="contact" placeholder="Enter contact Number" name="contact">
    </div>
    <div class="form-check mb-3">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="blocked"> Block Contact
      </label>
    </div>
    <button type="submit" class="btn btn-success">Create Contact</button>
  </form>
</div>




</body>
</html>
