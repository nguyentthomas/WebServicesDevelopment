<%-- 
    Document   : BookDetailPage
    Created on : 24/04/2018, 4:01:00 PM
    Author     : Tim
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
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String category = request.getParameter("category");
            String abs = request.getParameter("abs");
            String condition = request.getParameter("condition");
            String isbn = request.getParameter("isbn");
            String publishYear = request.getParameter("publishYear");
            String publisher = request.getParameter("publisher");
            String lister = request.getParameter("lister");
       
        %>
        
       <!--parameters of lister and textbooksLists go down here-->
        <table>
            <tr>
                <td>
                    <h2><%=title%></h2>
                    <p>Author : <%=author%></p>
                    <p>Category : <%=category%></p>
                    <p>Description: 
                        <%=abs%></p>
                    <p><%=condition%> condition !</p>
                    <p>&lt;<%=isbn%>&gt;</p>
                    <p><%=publishYear%></p>
                    <p><%=publisher%></p>
                    <p align="right">Lister name : <%=lister%></p>
                    
                    
                </td>
            </tr>
        </table>
    </body>
</html>
