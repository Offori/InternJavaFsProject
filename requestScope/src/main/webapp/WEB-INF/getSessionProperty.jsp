<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get session property</title>
</head>
<body>
<jsp:useBean id="User" class="org.ciStudy.beans.User" scope="session"></jsp:useBean>
First name:<jsp:getProperty property="firstName" name="User"/><br>
Last name:<jsp:getProperty property="lastName" name="User"/>
</body>
</html>