<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <p> <%=request.getAttribute("req")%> </p>
 <p> <%=session.getAttribute("session")%> </p>
 <p> <%=application.getAttribute("app")%> </p>
  <p> <%=pageContext.getAttribute("page")%> </p>
</body>
</html>