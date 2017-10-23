
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Nars Lipsticks</title>
          <link rel="stylesheet" type="text/css" href="formatting.css"/> 
    </head>
    
    <% String table = (String) request.getAttribute("table");%>
    <body>
        <div class="wrap">
            <%@include file="includes/header.jsp"%>
              <br><br><br><br>
              <%@include file="includes/menu.jsp"%>
              <div class="main">
        <h1>Nars Lipsticks</h1>
     
        
        <%= table %>
        
      
        <br><br>
        
        <a href ="add"> Add A New Lipstick </a>
        <br><br>
        <a href="search.jsp"> Search Lipsticks </a>
            </div> 
       <%@include file="includes/footer.jsp"%>
       
        </div>
    </body>
</html>
