<%--
  Created by IntelliJ IDEA.
  User: lata
  Date: 2019/4/2
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script ></script>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/user/addRole">
    编号：<input type="text" name="id"><br>
    <input type="text" name="userName"><br>
    <input type="text" name="pwd"><br>
    <input type="submit" value="提交">
</form>
<%--<script type="text/javascript">--%>
    <%--$(document).ready(function () {--%>
        <%--alert("我的第一个jQuery代码!");--%>
    <%--});--%>
<%--</script>--%>
</body>
</html>
