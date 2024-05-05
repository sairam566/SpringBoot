<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Customers List</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>DOB</th>
			<th>Gender</th>
		</tr>
		<c:forEach items="${allcustomers}" var="cust">
			<tr>
				<td>${cust.customerNo}</td>
				<td>${cust.name}</td>
				<td>${cust.dob}</td>
				<td>${cust.gender}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>