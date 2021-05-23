<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


${employeeAttribute.id}
${employeeAttribute.name}
${employeeAttribute.salary}
${employeeAttribute.department.id}
${employeeAttribute.department.name}

<h1>bracket</h1>
<p>${employeeAttribute['id']}</p>
<p>${employeeAttribute['name']}</p>
<p>${employeeAttribute['salary']}</p>
<p>${employeeAttribute['department']['id']}</p>
<p>${employeeAttribute['department']['name']}</p>

</body>
</html>