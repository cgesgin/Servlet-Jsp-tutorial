<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p> ${cookie.username.value} </p>
<p> ${pageContext.request.method} </p>
<p> <%=request.getMethod() %></p><!-- ${pageContext.request.method} bununla aynı işiyapan bir expression implicit 
											object'tir. -->	
<p><%=request.getHeader("host") %></p>
<p>	${header.host}	</p>
<p>	${myAttribute}	</p>
<p>	${requestScope.myAttribute}	</p>
<p>	${sessionScope.myAttribute}	</p>
</body>
</html>