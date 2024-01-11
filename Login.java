package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("submit").equals("submit")) {
			String username = null;
			username = request.getParameter("username");
			String password = null;
			password = request.getParameter("password");
			PrintWriter out = response.getWriter();
			HttpSession se = request.getSession();
			if(username != null && password != null) {
				if(username.equals("harsha") && password.equals("vardhan")) {
					se.setAttribute("user", username);
					response.sendRedirect("logoutpage.jsp");
				}else {
					request.getRequestDispatcher("login.html").include(request, response);
					out.println("invalid Username or Password");
				}
			}else {
				request.getRequestDispatcher("login.html").include(request, response);
				out.println("username or password are empty");

			}
		}
	}

}