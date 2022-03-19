<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
	Cookie[] cookies = request.getCookies();
	System.out.println("coockies : " + cookies);

	if (cookies != null) {
		for (Cookie c : cookies) {
			if (c.getName().equals("memberID")) {
		response.sendRedirect("loginOK.jsp");
			}
		}
	}
	%>

	<form action="loginConfig" method="post">
		ID : <input type="text" name="mID"></br> PW : <input type="text"
			name="mPW"></br> <input type="submit" value="login">
	</form>
</body>
</html>