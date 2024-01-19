<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
it's Home-Page.<br>
<a href="<%=request.getContextPath() %>/Controler?page=loging">Login</a><br/>
<a href="<%=request.getContextPath() %>/Controler?page=sigup">Sigh Up</a><br/>
<a href="<%=request.getContextPath() %>/Controler?page=about">About</a><br/>
</body>
</html>