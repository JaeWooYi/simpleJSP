<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<%!
	
	int num = 10;
	String str = "jsp";
	
	ArrayList<String> list = new ArrayList<String>();
	
	public void jspMethod(){
		System.out.println(" -- jspMethod() --");
	}
	
	%>

	<!-- <%-- --%> jsp 주석이야 -->
	<%-- <%! %>를 통해 자바코드(멤버변수 또는 메서드 선언)를 쓸 수 있다. --%>
	<%-- <% %>도 자바코드를 쓸 수 있다. --%>

	<!-- 스크립틀릿 태그 예시 -->
	<%
	if (num > 0) {
	%>
	<p>num > 10</p>
	<% 
	}else{ 
	%>
	<p>num <= 0</p>
	<%
	}
	%>

	<!-- 표현식 태그 -->
	num is
	<%=num %>

	<%@ include file="footer.jsp"%>

</body>
</html>