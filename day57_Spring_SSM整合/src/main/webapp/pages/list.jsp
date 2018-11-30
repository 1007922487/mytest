<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="3" align="center" width="300px">
    <tr>
        <th>序号</th>
        <th>账户编号</th>
        <th>用户id</th>
        <th>账户余额</th>
    </tr>
    <c:forEach var="a" items="${list}" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${a.accountId}</td>
            <td>${a.uid}</td>
            <td>${a.money}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
