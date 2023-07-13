<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Manager</title>
</head>
<body>
<div align="center">
	<h2>Account Manager</h2>
	<form method="get" action="search">
		<input type="text" name="keyword" /> &nbsp;
		<input type="submit" value="Search" />
	</form>
	<h3><a href="new">New Account</a></h3>
	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Account Number</th>
			<th>Account Holder First Name</th>
			<th>Account Holder Last Name</th>
			<th>Account Savings</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${listAccount}" var="account">
		<tr>
			<td>${account.id}</td>
			<td>${account.customerAccountNumber}</td>
			<td>${account.customerfname}</td>
			<td>${account.customerlname}</td>
			<td>${account.customerSavings}</td>
			<td>
				<a href="edit?id=${account.id}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete?id=${account.id}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</div>	
</body>
</html>