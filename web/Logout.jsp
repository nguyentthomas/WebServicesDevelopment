<%-- 
    Document   : Logout.jsp
    Created on : 19/05/2018, 9:03:54 PM
    Author     : HenryDinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate(); //session is removed
            response.sendRedirect("MainPage.jsp"); //redirects back to mainpage, with table
        %>
    </body>
</html>
