
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<thead>
<tr>
<td>cartoonId</td>
<td>cartoonName</td>
<td>update</td>
</tr>
</thead>
<tbody>
	<c:forEach var="cartoon" items="${cartoonList}">
	<tr>
		<td>${cartoon.getCartoonId()}</td>
		<td>${cartoon.getCartoonName()}</td>
		<td><a href="update.jsp">Edit</a></td>
		
		</tr>
	</c:forEach>
	</tbody>
</table>

</body>
</html>