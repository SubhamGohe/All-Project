 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Marketing Records</title>
</head>
<body>
    <h1>Marketing Records</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Brand</th>
        </tr>
        <c:forEach items="${marketingList}" var="marketing">
            <tr>
                <td>${marketing.id}</td>
                <td>${marketing.name}</td>
                <td>${marketing.phone}</td>
                <td>${marketing.brand}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
 