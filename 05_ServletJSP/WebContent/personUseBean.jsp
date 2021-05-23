<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="person1" class=jspaction.model.Person scope="request"></jsp:useBean>

<jsp:setProperty property="name" name="person1"/>
<jsp:setProperty property="surname" name="person1"/>
<jsp:setProperty property="age" name="person1"/>

</body>
</html>