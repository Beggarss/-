<%--
  Created by IntelliJ IDEA.
  User: lata
  Date: 2019/4/2
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <form method="get" action="${pageContext.request.contextPath}/test.do">
  编号：<input type="text" name="id"><br>
     <input type="submit" value="提交">
 </form>

</body>
</html>
