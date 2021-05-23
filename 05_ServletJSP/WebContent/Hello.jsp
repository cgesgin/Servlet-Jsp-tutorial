<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="java.util.List,java.util.ArrayList" %><!-- jsp directive -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP FILE</title>
</head>
<body>
<h1>HEllo Jsp File</h1>

<% 
//jsp tag
	System.out.println("JSP taglarıdan java kodlaı yazıyorum.");
%>

<%
	String User="admin",pass="123";//global değişken
%>

<%=User %><!-- expression language -->

<%! 
// jsp decleration
	public int topla(int a,int b){
		return a+b;
	} 
%>
<%=topla(5,19) %>
</body>
</html>