package Jdbc3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		String url ="jdbc:mysql://localhost:3306/phase2assessment";
		String username ="root";
		String password ="Rajashekar@050790";
		
		PrintWriter out = response.getWriter();
		
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			out.println("okay");
			
		} catch (SQLException e) {
			
			System.err.println("Connection fails");
			
		}catch(ClassNotFoundException e) {
			
			System.out.println("no class");
		}
		
		
		
	}


}
