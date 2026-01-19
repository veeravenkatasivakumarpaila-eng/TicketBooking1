<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>User Search</title>
</head>
<body>

<h2>User Search</h2>

<form action="${pageContext.request.contextPath}/user/search/" method="get">
    <input type="text" name="name" placeholder="Enter name" value="${searchName}" required />
    <button type="submit">Search</button>
</form>

<br/>

<c:if test="${not empty users}">
    <h3>Search Results</h3>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstName}</td>
                <td>${user.email}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<c:if test="${empty users && searchName != null}">
    <p>No users found.</p>
</c:if>

</body>
</html>
