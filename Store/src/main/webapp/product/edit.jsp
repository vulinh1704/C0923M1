<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 3/15/2024
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h1>Edit</h1>
<form action="http://localhost:8080/products?action=edit" method="post">
    <input type="number" name="id" placeholder="ID" value="${productEdit.id}" readonly>
    <input type="text" name="name" placeholder="NAME" value="${productEdit.name}">
    <input type="number" name="price" placeholder="Price" value="${productEdit.price}">
    <input type="text" name="image" placeholder="IMAGE" value="${productEdit.image}">
    <img src="${productEdit.image}" alt="">
    <button>Submit</button>
</form>
</body>
</html>
