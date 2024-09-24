
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%@page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<h1>this is home page </h1>


<h2>Name is : ${name }</h2>


<%-- <%
String names =(String) request.getAttribute("name");
int mobile = (Integer)request.getAttribute("mobile");
List<String> st = (List<String>) request.getAttribute("sts");
%>

<h1>Name is : <%=names%></h1>
<h1>Mobile number is : <%=mobile%></h1> --%>



<%-- <%
for(String s:st){
%>	

<h2><%=s %></h2>
<%
}
%> --%>




</body>
</html>