package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.BookDAO;
import com.servlet.dto.BookDTO;

@WebServlet("/bs")
public class BookServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		/*
		 * String driver = "oracle.jdbc.driver.OracleDriver"; String url =
		 * "jdbc:oracle:thin:@localhost:1521:xe"; String id = "scott"; String pw =
		 * "tiger";
		 * 
		 * java.sql.Connection con = null; Statement stmt = null; ResultSet res = null;
		 * 
		 * try {
		 * 
		 * Class.forName(driver); con = DriverManager.getConnection(url, id, pw); stmt =
		 * con.createStatement(); String sql = "SELECT * FROM book"; res =
		 * stmt.executeQuery(sql);
		 * 
		 * while (res.next()) { int bookID = res.getInt("book_id"); String bookName =
		 * res.getString("book_name"); String bookLoc = res.getString("book_loc");
		 * 
		 * out.print("bookID : " + bookID + ", "); out.print("bookName : " + bookName +
		 * ", "); out.print("bookLoc : " + bookLoc + "</br>"); } } catch (Exception e) {
		 * e.printStackTrace(); } finally { try { if (res != null) res.close(); if (stmt
		 * != null) stmt.close(); if (con != null) con.close(); } catch (Exception e2) {
		 * e2.printStackTrace(); } }
		 */

		BookDAO bookdao = new BookDAO();
		ArrayList<BookDTO> list = bookdao.select();

		for (int i = 0; i < list.size(); i++) {
			BookDTO dto = list.get(i);
			int bookId = dto.getBookId();
			String bookName = dto.getBookName();
			String bookLoc = dto.getBookLoc();

			out.println("bookId" + bookId + ", ");
			out.println("bookNmae" + bookName + ", ");
			out.println("bookLoc" + bookLoc + "</br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
