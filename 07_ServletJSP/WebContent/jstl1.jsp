<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib	uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="merhaba"></c:out>
<p> <%= "<h1>expression</h1>" %> </p>
<c:out value="<h1>Cout expression</h1>"></c:out>
<c:set var="SessionAttribute" scope="session" value="My value" ></c:set>
<c:out value="${SessionAttribute}"></c:out>
<c:remove var="SessionAttribute"/>
<p>after Remove :<c:out value="${SessionAttribute}"></c:out>
</p>


</body>
</html>