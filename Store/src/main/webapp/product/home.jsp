<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 3/15/2024
  Time: 7:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>
        img {
            width: 100px;
            height: 100px;
        }
    </style>
</head>
<body>
<a href="http://localhost:8080/products?action=add">Thêm mới</a>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Image</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach var="item" items="${productList}">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td><img src="${item.image}" alt=""></td>
            <td>
                <button><a href="http://localhost:8080/products?action=edit&idEdit=${item.id}">Sửa</a></button>
            </td>
            <td>
                <button>Xóa</button>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
