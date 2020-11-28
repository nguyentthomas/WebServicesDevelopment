<%-- 
    Document   : LoginAction
    Created on : 22/05/2018, 2:55:35 PM
    Author     : HenryDinh
--%>

<%@page import="uts.wsd.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- allows the use of the bean  -->
<%String filePath = application.getRealPath("WEB-INF/Listers.xml");%>
<jsp:useBean id="diaryApp" class="uts.wsd.DiaryApplication" scope="application">
    <jsp:setProperty name="diaryApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LoginAction.jsp</title>
    </head>

    <body>

        <%
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            // Retrieves listers data if available via DiaryApplication
            Listers listers = diaryApp.getListers();
            Lister lister = listers.login(userName, password);

            UserValidator uservalidator = new UserValidator();
            PassValidator passvalidator = new PassValidator();

            // Username, Password, Lister validation process
            if (!uservalidator.validate(userName)) { //checks if username format is valid
                session.setAttribute("userNameErr", "Incorrect Username Format");
                response.sendRedirect("LoginPage.jsp?1");
            } else if (!passvalidator.validate(password)) { //checks if password format is valid
                session.setAttribute("passwordErr", "Incorrect Password Format");
                response.sendRedirect("LoginPage.jsp?2");
            } else if (lister != null) {  // checks if the lister exists
                session.setAttribute("lister", lister);
                session.setAttribute("userNameErr", userName);
                response.sendRedirect("MainPage.jsp?4");
            } else {  //if all fails, the lister does not exist
                session.setAttribute("existErr", "Lister does not exist");
                response.sendRedirect("LoginPage.jsp?3.1");
            }

        %>

    </body>
</html>
