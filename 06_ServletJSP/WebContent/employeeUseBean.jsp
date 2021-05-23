<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="employeeAttribute" class="_01.model.Employee" scope="request"/>

<jsp:getProperty property="id" name="employeeAttribute"/>
<jsp:getProperty property="name" name="employeeAttribute"/>
<jsp:getProperty property="salary" name="employeeAttribute"/>
<jsp:getProperty property="department" name="employeeAttribute"/>

</body>
</html>