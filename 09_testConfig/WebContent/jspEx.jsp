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
String adminID;
String adminPW;

String imgDir;
String testServerIP;
String realServerIP;
%>

<%
adminID = config.getInitParameter("adminID");
adminPW = config.getInitParameter("adminPW");
%>

<p>adminID : <%= adminID %></p>
<p>adminPW : <%= adminPW %></p>

<%
imgDir = application.getInitParameter("imgDir");
testServerIP = application.getInitParameter("testServerIP");
realServerIP = application.getInitParameter("realServerIP");
%>

<p> imgDir : <%= imgDir %></p>
<p> testServerIP : <%= testServerIP %></p>
<p> realServerIP : <%= realServerIP %></p>

</body>
</html>