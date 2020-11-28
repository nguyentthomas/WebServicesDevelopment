<%@page import="uts.wsd.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%String filePath = application.getRealPath("WEB-INF/Listers.xml");%>
<jsp:useBean id="diaryApp" class="uts.wsd.DiaryApplication" scope="application">
    <jsp:setProperty name="diaryApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<!-- retrieves any available values from the session and removes it after-->
<%
    String userErr = (String) session.getAttribute("userNameErr");
    session.removeAttribute("userNameErr");
    String passErr = (String) session.getAttribute("passwordErr");
    session.removeAttribute("passwordErr");
    String existErr = (String) session.getAttribute("existErr");
    session.removeAttribute("existErr");
%> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LoginPage.jsp</title>

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

        </style>
    <h1 class="alignleft">Login</h1>
    <div style="clear: both;"></div>


    <!--navigation bar-->
    <ul> 
        <li><a class="active" href="MainPage.jsp"> Home </a></li>
                       
    </ul>       

</head>
<body>
    <form action="LoginAction.jsp" method="post"> <!-- sends input data to main page if successful -->
        <!-- Table that lays out the input fields   -->
        <table>        
            <tr>
                <td> <label> Username </label> </td>
                <td> <input name="userName" type="text"> </td>
                <td>
                    <% if (userErr != null) {%>   <!-- if a User Error exists, the error is inserted here --> 
                    <font color="red"><%=userErr%></font>
                    <% } %>
                </td>
            </tr>
            <tr>
                <td><label> Password </label></td>
                <td><input name="password" type="password"> </td> 
                <td> 
                    <%
                    if (passErr != null) {%>   <!-- if a password Error exists, the error is inserted here --> 
                    <font color="red"><%=passErr%></font>
                    <% }%>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Login"></td>
                <td> 
                    <% if (existErr != null) {%>   <!-- if account does not exists, the error is inserted here --> 
                    <font color="red"><%=existErr%></font> 
                    <%}%>  
                </td>
            </tr>
        </table>
    </form>

    <p>Click here to <u><a href="register.jsp">Register</a></u>.</p> 
</body>
</html>
