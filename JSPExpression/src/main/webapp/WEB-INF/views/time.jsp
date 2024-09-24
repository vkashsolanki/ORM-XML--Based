
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Current time is :  ${time }</h2>

<%-- <h3>Student  marks are: ${list}</h3> --%>
<c:forEach var="item" items="${list }">
<%-- <h1>${item }</h1> --%>
<h1><c:out value="${item }"></c:out></h1>
</c:forEach>


</body>
</html>