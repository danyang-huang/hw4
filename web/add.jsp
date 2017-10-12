<%-- 
    Document   : add
    Created on : Oct 10, 2017, 5:08:35 PM
    Author     : danyhuang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a New Lipstick</title>
        <link rel="stylesheet" type="text/css" href="formatting.css"/>  
    </head>
    <body>
        <h2>Add a New lipstick</h2>
        <form name="addForm" action="addLipstick" method="get">
            
            <lable>Shade:</lable> <br>
            <input type="text" name="shade" value="" />
            <br><br>
            <lable>Series:</lable><br>
            <input type="text" name="series" value="" />
            <br><br>
            <lable>Price:</lable><br>
            <input type="text" name="price" value="" />
            <br><br>
            <lable>Rate:</lable><br>
            <input type="text" name="rate" value="" />
            <br><br>
          <input type="submit" name="submit" value="Submit" />
            
            
    </form>
        
        
        
    </body>
</html>
