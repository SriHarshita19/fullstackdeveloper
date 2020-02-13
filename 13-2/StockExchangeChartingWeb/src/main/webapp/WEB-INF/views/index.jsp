<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
<hr>
${message}
<hr>
<%-- <ol>
<c:forEach var="name" items="${list}">
<li><h3>${name}</h3></li>
</c:forEach>
</ol> --%>
<a href="user-home">User</a>
<table border="1">
<tr>
<th>ID</th>
<th>Email</th>
<th>Username</th>
<th>Password</th>
<th>Phone</th>
<th>Enabled</th>
</tr>
<c:forEach var="user" items="${list}">
<tr>
<td>${user.id}</td>
<td>${user.email}</td>
<td>${user.username}</td>
<td>${user.password}</td>
<td>${user.phone}</td>
<td>${user.enabled}</td>
</tr>
 </c:forEach>
</table>
</body>
</html>