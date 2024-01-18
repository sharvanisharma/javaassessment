package jdbc2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Jdbcproject2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		String url ="jdbc:mysql://localhost:3306/phase2assessment";
		String username ="root";
		String password ="Rajashekar@050790";
		
		PrintWriter out = response.getWriter();
		
		Connection conn =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, username, password);
		
			
			
		}catch(ClassNotFoundException e){
			System.err.println("No class found in sql");
		}catch(SQLException e) {
			System.err.println("Connection fail");
		}
		
		if(conn == null) {
			
			out.println("not connected");
		}else {
			out.println("connected");	
		}
		
	}

}
