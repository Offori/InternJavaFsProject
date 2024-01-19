<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="User" class=org.ciStudy.beans.User></jsp:useBean>
First Name:<jsp:getProperty property="User" name="firstName"/><br>
Last Name:<jsp:getProperty property="User" name="lastName"/>
</body>
</html>