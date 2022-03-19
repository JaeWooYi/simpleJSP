package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String adminID = getServletConfig().getInitParameter("adminID");
		String adminPW = getServletConfig().getInitParameter("adminPW");

		PrintWriter out = response.getWriter();
		out.print("<p>adminID : " + adminID + "</p>");
		out.print("<p>adminPW : " + adminPW + "</p>");

		String imgDirectory = getServletContext().getInitParameter("imgDirectory");
		String testServletIP = getServletContext().getInitParameter("testServletIP");
		out.print("<P>imgDerectory : " + imgDirectory + "</p>");
		out.print("<P>testServletIP : " + testServletIP + "</p>");

		getServletContext().setAttribute("connectedIP", "172.16.101.59");
		getServletContext().setAttribute("connectedUSER", "YJW");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
