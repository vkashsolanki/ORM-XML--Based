<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
<h1>this is vikash solanki</h1>
<%
String ss = (String)request.getAttribute("rm");
LocalDateTime times = (LocalDateTime)request.getAttribute("time");

%>
<h1><%=ss %></h1>
<h1><%=times %></h1>
</body>
</html>