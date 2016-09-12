<%-- 
    Document   : home
    Created on : Sep 7, 2016, 9:05:16 PM
    Author     : jcarl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Web Calculators</h1>
        <form id="fomr1" name="rectangleForm" method="POST" action="calculate?action=rectangle">
            <h2>Area of a Rectangle</h2>
            <image src="http://www.mathplanet.com/Oldsite/media/35322/rectangle03.png" /><br>       
            <label>Length: </label><input type="text" name="length" value=""/><br>
            <label>Width: </label><input type="text" name="width" value=""/> <br>
            <input type="submit" name="submit" value="Submit"/>
            <%
                Object obj = request.getAttribute("answer");
                String answer = "";
                if (obj == null){
                  answer = "";
                } else {
                  answer = obj.toString();
                }
                out.println("<p style='color:blue; font-weight:bold;'>" + answer + "</p>");
            %>  
        </form><br><hr>
        
        <form id="fomr2" name="circleForm" method="POST" action="calculate?action=circle">
            <h2>Area of a Circle</h2>
            <image src="http://www.calculateme.com/img/formulas/circle-area.png" /><br>       
            <label>Radius: </label><input type="text" name="radius" value=""/><br>
            <input type="submit" name="submit" value="Submit"/>
            <%
                Object obj2 = request.getAttribute("answer2");
                String answer2 = "";
                if (obj2 == null){
                  answer2 = "";
                } else {
                  answer2 = obj2.toString();
                }
                out.println("<p style='color:blue; font-weight:bold;'>" + answer2 + "</p>");
            %>
        </form><br><hr>
        
        <form id="fomr3" name="triangleForm" method="POST" action="calculate?action=triangle">
            <h2>Find the Hypotenuse</h2>
            <image src="https://www.algebra.com/calculators/geometry/pyth.jpg" /><br>       
            <label>Side A </label><input type="text" name="sideA" value=""/><br>
            <label>Side B: </label><input type="text" name="sideB" value=""/> <br>
            <input type="submit" name="submit" value="Submit"/>
            <%
                Object obj3 = request.getAttribute("answer3");
                String answer3 = "";
                if (obj3 == null){
                  answer3 = "";
                } else {
                  answer3 = obj3.toString();
                }
                out.println("<p style='color:blue; font-weight:bold;'>" + answer3 + "</p>");
            %>
        </form>
    </body>
</html>
