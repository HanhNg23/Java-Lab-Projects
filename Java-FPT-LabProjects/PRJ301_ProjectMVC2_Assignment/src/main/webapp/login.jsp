<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Hello World!</h1>
	<form action="DispatchServlet" method="POST">
		Username <input type="text" name="txtUsername"><br>
		<br> Password <input type="password" name="txtPassword"><br>
		<br> <input type="reset" value="Reset"> <input
			type="submit" value="Login" name="btAction"><br>
	</form>
	<br>
	<!-- comment -->

	<a href="shopping.html">Go to shop </a>
	<br>
	<a href="createAcc.html">Sign Up</a>
	<br>

</body>
</html>
