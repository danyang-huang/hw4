
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Lipsticks"%>
<% Lipsticks lipstick = (Lipsticks) request.getAttribute("lipstick"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a Lipstick</title>
        <link rel="stylesheet" type="text/css" href="formatting.css"/>  
    </head>
    <body>
         <div class="wrap">
            <%@include file="includes/header.jsp"%>
              <br><br><br><br>
              <%@include file="includes/menu.jsp"%>
        <h1>Update a Friend Record</h1>
        
        <form name="updateForm" action="updateLipstick" method="post">
            
            <table>
                
                 <tr>
                    <td>Nars ID:</td>
                    <td><input type="text" name="narsid" value=" <%= lipstick.getNarsID() %>" readonly/> </td>
                    
                </tr>
                
                <tr>
                    <td>Shade:</td>
                    <td><input type="text" name="shade" value="<%= lipstick.getShade() %>"/> </td>
                    
                </tr>
                
                 <tr>
                    <td>Series:</td>
                    <td><input type="text" name="series" value="<%= lipstick.getSeries() %>"/> </td>
                    
                </tr>
                
                 <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price" value="<%= lipstick.getPrice() %>"/> </td>
                    
                </tr>
                
                 <tr>
                    <td>Rate:</td>
                    <td><input type="text" name="rate" value="<%= lipstick.getRate() %>"/> </td>
                    
   
                </tr>
             
            </table>
                    
                    <br>
                    <input type="reset" name="reset" value="Clear"/>
                    <input type="submit" name="submit" value="Update" />
                
                
                
                
            </form>
          <%@include file="includes/footer.jsp"%>  
         </div>
    </body>
</html>
