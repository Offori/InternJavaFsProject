<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP file</title>
</head>
<body>
<!-- for static content -->
<%@ include file="file1.txt" %>
<!-- for dynamic content -->
<jsp:include page="file2.txt"></jsp:include>
</body>
</html>