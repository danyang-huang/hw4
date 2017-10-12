
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Nar Lipsticks</title>
          <link rel="stylesheet" type="text/css" href="formatting.css"/>  
    </head>
    
    <% String table = (String) request.getAttribute("table");%>
    <body>
        <h1>Nars Lipsticks</h1>
     
        
        <%= table %>
        
      
        <br><br>
        
        <a href ="add"> Add A New Lipstick </a>
        
    </body>
</html>
