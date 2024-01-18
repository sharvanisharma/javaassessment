package jdbc5;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc5project extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int option = Integer.parseInt(request.getParameter("value"));
		
		response.setContentType("text/html");
		
		
		
		String url ="jdbc:mysql://localhost:3306/phase2assessment";
		String username ="root";
		String password ="Rajashekar@050790";
		
		PrintWriter out = response.getWriter();
		
		Connection conn =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, username, password);
			
			String query = null;
			
			Statement stm  =conn.createStatement();
			
			int res =0;
			
			switch(option) {
			case 1:
				query = "create database sharvani";
				 res = stm.executeUpdate(query);
				 
				 if(res ==1) {
					 out.println("created");
				 }else {
					 out.println("not created");
				 }
				break;
			case 2:
				query ="show databases";
				 ResultSet obj = stm.executeQuery(query);
				 
				 while(obj.next()) {
					 out.println(obj.getString("Database")+"<br>");
				 }
				break;
			case 3:
				
				query ="drop database sharvani";
				
				 res = stm.executeUpdate(query);
				 
				 if(res ==1) {
					 out.println("droped");
				 }else {
					 out.println("not droped");
				 }
				 break;
			}
		
			
			
		}catch(ClassNotFoundException e){
			System.err.println("No class found in sql");
		}catch(SQLException e) {
			System.err.println("Connection fail");
		}
		
		
		out.close();
		
		
		
	}


}
