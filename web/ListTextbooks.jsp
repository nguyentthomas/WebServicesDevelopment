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

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ListTextbooks.jsp</title>

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
        <h1 class="alignleft">List a Textbook</h1>
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
            <a class="active" href="ReserveBookPage.jsp"> Reserve </a>
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
    <p> Please fill out the form below to enlist a book. </p>
    <form action="Listsuccessful.jsp" method="POST"> <!-- all below is used as a form, to send a request/"post" to server with the info inputted by user below-->
        <table>
            <tr>
                <td>Title:</td> 
                <td><input style="width:100px" name="title" type="text"> </td>
            </tr>

            <tr>
                <td>Author:</td>
                <td><input style="width:100px" name="author" type="text"> </td>
            </tr>

            <tr>
                <td>Category:</td>
                <td><input name="category" type="text"> </td>
            </tr>

            <tr>
                <td>Condition:</td>
                <td><select name="condition" required>
                        <option disabled selected value></option>
                        <option>Poor</option>
                        <option>Fair</option>
                        <option>Good</option>
                        <option>New</option>                  
                    </select></td>
            </tr>
        </table>

        <h3> Publication Details: </h3>

        <table>
            <tr>
                <td>Edition:</td>
                <td><select name="edition">
                        <option disabled selected value></option>
                        <option>First Edition</option>
                        <option>Second Edition</option>
                        <option>Third Edition</option>
                        <option>Fourth Edition</option>                  
                    </select></td>
            </tr>    

            <tr>
                <td>Publisher:</td>
                <td><input name="publisher" type="text"></td>
            </tr>    

            <tr>
                <td>Year of Publication:</td>
                <td><input name="yearofpublication" type="number"></td>
            </tr>    

        </table>


        <h3>Abstract:</h3>
        <table>
            <tr>
                <td><textarea rows="6" cols="50" name="abstractInfo" form="ListTextbooks.jsp"> Enter text here... </textarea></td>
                <td></td>
            </tr>
            <tr>            
            </tr>
            <tr>
                <td><label>    </label></td>
                <td>                   </td>
                <td><input name type="submit" value="Submit"> </td> <!--submit button-->
            </tr>
        </table>
    </form>






    <%
        //String title = request.getParameter("name");
        //String author = request.getParameter("author");
        //String category = request.getParameter("category");
        //String condition = request.getParameter("condition");
        //String publisher = request.getParameter("publisher");
        //String yearofpublication =  request.getParameter("yearofpublication");
        //String abstractInfo =  request.getParameter("abstractInfo"); 

        // Textbook textbook = new Textbook(title, author, category, condition, edition, publisher, yearofpublication, abstractInfo);
        //BookApplication bookApp = new BookApplication();
        //bookApp
        // session.setAttribute("textbook", textbook);
        //users.addTextbook(textbook);
        //diaryApp.updateXML(textbook, filePath);
%>





</body>
</html>
