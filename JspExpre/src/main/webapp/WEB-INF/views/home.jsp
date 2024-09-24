<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ page isELIgnored = "false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is home page hai </h1>

<%-- <h1>Nane is : : ${name }  </h1> --%>

<%
String s=(String)request.getAttribute("name");
%>

<%=s %>

</body>
</html>