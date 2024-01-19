<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="org.ciStudy.beans.User" scope="session"></jsp:useBean>
<jsp:setProperty property="firstName" name="user"/>
<jsp:setProperty property="lastName" name="user"/>
Values have been set...
</body>
</html>