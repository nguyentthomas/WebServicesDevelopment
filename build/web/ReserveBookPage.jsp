<%-- 
    Document   : ReserveBookPage
    Created on : 24/04/2018, 4:01:28 PM
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
        <h1 class="alignleft">Reservation Operation</h1>
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
        <div align="center">
            <fieldset>
                <h1>Reserve Book Here</h1>

                <form action="reservesuccess.jsp" method="POST">
                    <table align="center">

                        <h1 align ="center"> Please Enter the following details to reserve ! </h1>
                         <tr>
                            <td><label>Title</label></td>
                            <td><input name="title"/></td>   
                        </tr>
                        <tr>
                            <td><label>Email:</label></td>
                            <td><input name="email"/></td>   
                        </tr>
                        <br>
                        <tr>
                            <td><label>Name:</label></td>
                            <td><input name="name" type="name"/></td>
                        </tr>
                        <tr>
                            <td><td>
                            <td><input type="submit" value="Reserve"></td>
                        </tr>

                    </table>
                </form>
            </fieldset>
        </div>
    </body>
</html>
