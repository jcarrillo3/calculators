<%-- 
    Document   : result
    Created on : Sep 7, 2016, 9:22:20 PM
    Author     : jcarl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The answer is...</h1>
        <%
            Object obj = request.getAttribute("answer");
            String msg = "Unknown";
            if (obj != null){
              msg = obj.toString();
            }
          out.println("<p style='color:blue; font-weight:bold;'>" + msg + "</p>");
        %>    
    </body>
</html>
