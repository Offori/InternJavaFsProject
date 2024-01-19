<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get page property</title>
</head>
<body>
<jsp:useBean id="User" class="org.ciStudy.beans.User"></jsp:useBean>
First Name:<jsp:getProperty property="firstName" name="User" scope="page"/><br>
First Name:<jsp:getProperty property="lastName" name="User"/>
</body>
</html>