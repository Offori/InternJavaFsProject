<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Form demo</title>
</head>
<body>
<form action="Controller" method="get">
	Full name:<input type="text" name="name" requiered><br>
	gender:<input type="radio" name="gender" value="male" checked="checked">Male
	gender:<input type="radio" name="gender" value="female">Female<br>
	Language Known:	<input type="checkbox" name="language" value="english">English <br>
					<input type="checkbox" name="language" value="hindi">Hindi <br>
					<input type="checkbox" name="language" value="french">French <br>
	Country:	<select name="country">
					<option value="india">India</option>
					<option value="usa">USA</option>
					<option value="uk">UK</option>
					<option value="finland">Finland</option>
					<option value="fiji">Fiji</option>
				</select><br>
				<input type="submit" value="Submit">
</form>
</body>
</html>