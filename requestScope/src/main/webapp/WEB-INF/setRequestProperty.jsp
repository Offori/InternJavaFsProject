<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="User" class=org.ciStudy.beans.User scope="request"></jsp:useBean>
<jsp:setProperty property="firstName" name="User" value="Offori"/><br>
<jsp:setProperty property="firstName" name="User" value="Christ"/>
<%
	request.getRequestDispatcher("getRequestProperty.jsp").forward(request, response);
%>
</body>
</html>