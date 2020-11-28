<%-- 
    Document   : ListTextbooks
    Created on : 25/05/2018, 12:44:39 PM
    Author     : HenryDinh
--%>
<%@page import="uts.wsd.*"%>
<% String filePath = application.getRealPath("WEB-INF/Listers.xml");%>
<jsp:useBean id="diaryApp" class="uts.wsd.DiaryApplication" scope="application">
    <jsp:setProperty name="diaryApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>
<%Listers listers = diaryApp.getListers();%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri="http://java.sun.com/jsp/jstl/xml" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listings.jsp</title>

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
        <h1 class="alignleft">Listings</h1>
        <table class="alignright">     
            <tr> 
                <td><h2><%=userName%> | <a href="Logout.jsp">Logout</a></h2></td>  
            </tr>
        </table> 
    </div>
    <div style="clear: both;"></div>

    <!-- navigation bar -->
    <ul> 
        <li>
            <a class="active" href="MainPage.jsp"> Home </a>
        </li>

        <li>           
            <a class="active" href="MainPage.jsp"> Listings </a>            
        </li>

        <li>           
            <a class="active" href="ListTextbooks.jsp"> List TextBook </a>            
        </li>
    </ul>       
</head>



<body>
    <h3 align="center">My Listings</h3>

    <c:import url="TextbooksLists.xml" var = "xmltext"/> <!-- used in lecture -->
    <c:import url = "TextbooksLists.xsl" var = "xslt"/>
    <x:transform xml = "${xmltext}" xslt = "${xslt}"/>



    <%
        //String title = request.getParameter("name");
        //String author = request.getParameter("author");
        //String category = request.getParameter("category");
        //String condition = request.getParameter("condition");
        //String publisher = request.getParameter("publisher");
        //String yearofpublication =  request.getParameter("yearofpublication");
        //String abstractInfo =  request.getParameter("abstractInfo"); 

        // Textbook textbook = new Textbook(title, author, category, condition, edition, publisher, yearofpublication, abstractInfo);
        // session.setAttribute("textbook", textbook);
        //users.addTextbook(textbook);
        //diaryApp.updateXML(textbook, filePath);
%>





</body>
</html>
