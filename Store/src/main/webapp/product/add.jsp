<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 3/15/2024
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD</title>
</head>
<body>
<a href="http://localhost:8080/products?action=home">Trang chủ</a>

<form action="http://localhost:8080/products?action=add" method="post">
    <input type="text" name="name" placeholder="NAME">
    <input type="number" name="price" placeholder="Price">
    <input type="text" name="image" placeholder="IMAGE">
    <select name="idCategory">
        <c:forEach var="item" items="${list}">
            <option value="${item.id}">${item.name}</option>
        </c:forEach>
    </select>
    <button>Submit</button>
</form>

</body>
</html>
