<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.print("Value 1:\t"+request.getParameter("getValue1")+"\n");
out.print("Value 2:\t"+request.getParameter("getValue2")+"\n");
%>
</body>
</html>