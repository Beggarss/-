<%--
  Created by IntelliJ IDEA.
  User: lata
  Date: 2019/4/2
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <table>
     <tr>
         <td>标签</td>
         <td>值</td>
     </tr>
     <tr>
         <td>编号</td>
         <td><c:out value="${user.id}"></c:out></td>
     </tr>
     <tr>
         <td>名称</td>
         <tD><c:out value="${user.userName}"></c:out></tD>
     </tr>
     <tr>
         <td>密码</td>
         <td><c:out value="${user.pwd}"></c:out></td>
     </tr>
 </table>
</body>
</html>
