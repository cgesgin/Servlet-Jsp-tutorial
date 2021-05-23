<%@page import="java.util.List"%>
<%@page import="java.util.*"%>
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

<c:forEach begin="1" end="10" var="number">
	<c:out value="${number}"></c:out>
</c:forEach>
<h1>ARRAY</h1>
<% int [] numbers={1,2,3,4,5,6,7,7,8,9};
	request.setAttribute("numberArray", numbers);
%>

<c:forEach var="i" items="${numberArray}">
	%{i},
</c:forEach>

<c:forEach var="i" items="${numberArray}" varStatus="loopStatus">
	%{loopStatus.index}, ${i}
</c:forEach>

<h1>LIST</h1>
<%
	List<String> list= new ArrayList<String>();
	list.add("value1");
	list.add("value2");
	list.add("value3");
	list.add("value4");
	
	request.setAttribute("myList", list);
%>
<c:forEach var="e" items="${myList}" >
	 ${e},
</c:forEach>

<h1>MAP</h1>
<%
	Map<String,String> map= new HashMap<String,String>();
	map.put("key1","value1");
	map.put("key2","value2");
	request.setAttribute("myMap", map);
%>
<c:forEach var="e" items="${myMap}" >
	 <p>${e.key},${e.value}</p>
</c:forEach>
<h1>ForTokens</h1>
<c:forTokens items="key1,key,2,key3" delims="," var="elements">
		${elements}
</c:forTokens>
</body>
</html>