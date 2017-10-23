
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="formatting.css"/> 
        <title>search lipstick</title>
    </head>
    <body>
         <div class="wrap">
            <%@include file="includes/header.jsp"%>
              <br><br><br><br>
              <%@include file="includes/menu.jsp"%>
              <div class="main">
        <h1>Search Lipstick by Shade</h1>
    
        <form name="searchForm" action="search" method="get">
            
            <input type="text" name="searchVal" value=""/>
            
            <br>
            
            <input type ="submit" name="submit" value="Search" />
            
            
         
        </form>
    </div>
    <%@include file="includes/footer.jsp"%>
         </div>
    </body>
</html>
