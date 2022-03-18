package com.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SLC")
public class e01_ServletLifeCycle extends HttpServlet {
	
	// servlet 실행 부분
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" -- doget() --");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	// init() 단계보다 먼저
	@PostConstruct
	public void postConstruct() {
		System.out.println(" -- postConstruct() -- ");
	}

	// servlet 생성단계
	@Override
	public void init() throws ServletException {
		System.out.println(" -- init() -- ");
	}

	// servlet 종료단계
	@Override
	public void destroy() {
		System.out.println(" -- destroy() -- ");
	}
	
	// servlet 종료되고 난 후에
	@PreDestroy
	public void preDestroy() {
		System.out.println(" -- preDestroy() -- ");
	}

}
