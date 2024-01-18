package Jdbc3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class jdbcproject3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html");
		
		String url ="jdbc:mysql://localhost:3306/phase2";
		String username ="root";
		String password ="Rajashekar@050790";
		
		PrintWriter out = response.getWriter();
		
		Connection conn =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, username, password);
			
			String query = "select * from mphasis";
			
			Statement stm  =conn.createStatement();
			
			ResultSet res = stm.executeQuery(query);
			
			
		}catch(ClassNotFoundException e){
			System.err.println("No class found in sql");
		}catch(SQLException e) {
			System.err.println("Connection fail");
		}
		
		
		out.close();
		
		
	}


}
