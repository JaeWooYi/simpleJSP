package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginConfig")
public class loginConfig extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter printWriter = response.getWriter();
		String mID = request.getParameter("mID");
		String mPW = request.getParameter("mPW");

		printWriter.print("<p> ID : " + mID + "</p>");
		printWriter.print("<p> PW : " + mPW + "</p>");

		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;

		for (Cookie c : cookies) {
			System.out.println("c.getName() : " + c.getName());
			System.out.println("c.getValue() : " + c.getValue());

			if (c.getName().equals("memberID")) {
				cookie = c;
			}
		}

		if (cookie == null) {
			System.out.println("cookie is null");
			cookie = new Cookie("memberID", mID);
		}

		response.addCookie(cookie);
		cookie.setMaxAge(60 * 60);

		response.sendRedirect("loginOK.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
