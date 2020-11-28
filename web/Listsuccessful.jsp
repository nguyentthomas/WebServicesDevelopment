<%-- 
    Document   : newjsp
    Created on : 30/05/2018, 6:16:17 PM
    Author     : Tim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style> 
            ul {
                list-style-type: none;
                margin: 5;
                padding: 5;
                overflow: hidden;
                background-color: #000;
            }   

            li {
                float: left;
            }

            li a{
                display: block;
                color: white;
                text-align: center;
                padding: 16px 18px;
                text-decoration: none;               
            }

            li a:hover {
                background-color: #111;
            }

            .active {
                background: #333
            }

            .alignleft {
                float: left;
            }

            .alignright {
                float: right;
            }
        </style>
        <%
            String userName = (String) session.getAttribute("userNameErr");
        %>

        <!-- header of the web page--> 
    <div id="textbox">   
        <h1 class="alignleft">Listsing Complete</h1>
        <% if (userName != null) {%> 
        <table class="alignright">     
            <tr> 
                <td><h2><%=userName%> | <a href="Logout.jsp">Logout</a></h2></td>  
            </tr>
        </table> 
        <% } else { %>
        <h2 class="alignright"> <a href="LoginPage.jsp">Login</a> </h2>
        <% }%>
    </div>
    <div style="clear: both;"></div>

    <!-- navigation bar -->
    <ul> 
        <li>
            <a class="active" href="MainPage.jsp"> Home </a>
             
        </li>
        <li>
            <a class="active" href="ReserveBookPage.jsp"> Reserve </a>
            </li>
        <% if (userName != null) { %> 
        <li>           
            <a class="active" href="MainPage.jsp"> Listings </a>            
        </li>
        <% }%>
        <% if (userName != null) { %> 
        <li>           
            <a class="active" href="ListTextbooks.jsp"> List TextBook </a>            
        </li>
        <% }%>
    </ul>
    </head>
    <body>
    
        <h1>
            Thanks for listing your new book by using our website.
            New Book Has Been Added.
        </h1>
    </body>
</html>
