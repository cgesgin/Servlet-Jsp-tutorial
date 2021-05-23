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

<c:set var="examResult" value="80" scope="request"></c:set>
<c:set var="name" value="admin"></c:set>
<c:if test="${examResult > 65}">
	<p>geçti</p>
</c:if>

<c:if test="${name eq 'admin'}">
	<p>merhaba admin</p>
</c:if>


<%
String result =(String)request.getAttribute("examResult");
if(Integer.parseInt(result)>65){
%>
	<p>geçtin java kodları</p>
<%} %>

<c:set var="salary" scope="request" value="5000"></c:set>
<c:choose>
	<c:when test="${salary < 1500}"> <p>dusuk maas</p></c:when>
	<c:when test="${salary < 400}"> <p>iyi maas</p></c:when>
	<c:otherwise><p>Diğer maas</p></c:otherwise>	
</c:choose>

</body>
</html>