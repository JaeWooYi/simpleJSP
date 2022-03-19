<% request.setCharacterEncoding("UTF-8"); %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String mName2;
String mNick2;
%>

<%
mName2 = request.getParameter("mName");
mNick2 = request.getParameter("mNick");
%>

이름 : <%= mName2 %>
</br>
닉넴 : <%= mNick2 %>

</body>
</html>