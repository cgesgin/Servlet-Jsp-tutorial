<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	request.setAttribute("req", "request Attribute");
	session.setAttribute("session", "session Attribute");
	application.setAttribute("app", "application Attribute");
	pageContext.setAttribute("page","Page context attribute");
%>

</body>
</html>