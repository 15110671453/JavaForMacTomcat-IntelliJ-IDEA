<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: admindyn
  Date: 2017/11/17
  Time: 下午4:37
  To change this template use File | Settings | File Templates.
--%>
<%

    Date date = (Date)request.getAttribute("date");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSPForWard</title>
    <link rel="stylesheet" href='"<%= request.getContextPath()%>/css/style.css"'>
</head>
<body>

<div align="center">
    <br/>
    <fieldset style="widows: 90%">
        <legend> Forward跳转---WEBINF</legend>
    </fieldset>


    <div>从 Forward Servlet  跳转到 jsp 获取 date</div>

    <div><%= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(date)%></div>
    <br/>

    <div>

        <div align="center">

            <input type="button" onclick='location="<%= request.getContextPath()%>/Basic/forward.jsp?destination=servlet"' value="跳转到servlet">

            <input type="button" onclick='location="<%= request.getContextPath()%>/Basic/forward.jsp?destination=file"' value="跳转到webxml">

        </div>
    </div>

</div>





</body>
</html>
