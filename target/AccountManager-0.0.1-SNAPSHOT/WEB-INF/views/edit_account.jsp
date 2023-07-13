<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Account</title>
</head>
<body>
	<div align="center">
		<h2>Edit Account</h2>
		<form:form action="save" method="post" modelAttribute="account">
			<table border="0" cellpadding="5">
				<tr>
					<td>ID: </td>
					<td>${account.id}
						<form:hidden path="id"/>
					</td>
				</tr>		
				<tr>
					<td>Account Number: </td>
					<td><form:input path="customerAccountNumber" /></td>
				</tr>			
				<tr>
					<td>Account Holder First Name: </td>
					<td><form:input path="customerfname" /></td>
				</tr>
				<tr>
					<td>Account Holder Last Name: </td>
					<td><form:input path="customerlname" /></td>
				</tr>
				<tr>
					<td>Account Holder Address: </td>
					<td><form:input path="customerAddress" /></td>
				</tr>	
				<tr>
					<td>Account Savings: </td>
					<td><form:input path="customerSavings" /></td>
				</tr>			
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
		</form:form>
	</div>
</body>
</html>