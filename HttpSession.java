package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/doct");
		
		HttpSession se = (HttpSession) request.getSession();
		
		PrintWriter out = response.getWriter();
		
//		request.getRequestDispatcher("session.html").include(request, response);
		out.println(((ServletRequest) se).getAttribute("name"));
	
	}

	

}

