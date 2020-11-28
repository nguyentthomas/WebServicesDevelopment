<%-- 
    Document   : MainPage
    Created on : 24/04/2018, 4:00:27 PM
    Author     : Tim
--%>
<%String filePath = application.getRealPath("WEB-INF/Listers.xml");%>
<jsp:useBean id="diaryApp" class="uts.wsd.DiaryApplication" scope="application">
    <jsp:setProperty name="diaryApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@page import="uts.wsd.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>MainPage.jsp</title>

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
        <h1 class="alignleft">Main Page</h1>
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
    <h3 align="center">List of Books:</h3>
    <c:import url="TextbooksLists.xml" var = "xmltext"/>
    <c:import url = "TextbooksLists.xsl" var = "xslt"/>
    <x:transform xml = "${xmltext}" xslt = "${xslt}"/>
</body>
</html>
