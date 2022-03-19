package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/seg")
public class ServletGet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String connectedIP = (String) getServletContext().getAttribute("connectedIP");
		String connectedUSER = (String) getServletContext().getAttribute("connectedUSER");
		PrintWriter out = response.getWriter();
		out.print("<p>connectedIP : " + connectedIP + "</p>");
		out.print("<p>connectedUSER : " + connectedUSER + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
