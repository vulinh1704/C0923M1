<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 3/13/2024
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<% String name = (String) request.getAttribute("name");--%>
<%--    String[] names = (String[]) request.getAttribute("names");--%>
<%--%>--%>
<%--<h1>Hello <%= name %>--%>
<%--</h1>--%>
<%--<% for (String s : names) { %>--%>
<%--<h1><%= s %></h1>--%>
<%--<%}%>--%>

<h1>${name}</h1>
<c:forEach var="item" items="${names}">
    <c:if test="${item != 'B'}">
        <h1>${item}</h1>
    </c:if>
</c:forEach>

<h1>Id: ${product.id} - Name: ${product.name}</h1>
</body>
</html>


Tạo một List product và hiển thị ra danh sách đó
- Hiển thị ra sản phẩm chứa chữ "u"
