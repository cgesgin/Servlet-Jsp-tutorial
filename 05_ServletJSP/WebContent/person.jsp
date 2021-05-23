<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="jspaction.model.Person" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Person personObj=(Person) request.getAttribute("person1");
%>
<h3>Person</h3>
<p> <%=personObj.getName()%> </p>
<p> <%=personObj.getSurname()%> </p>
<p> <%=personObj.getAge()%> </p>
</body>
</html>