package Dbms1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbmsproject1 {

	private String url ="jdbc:mysql://localhost:8080/phase2";
	private String username ="root";
	private String password ="Sharvani@2000";
	
	
	private Connection conn =null;

	
	
	public dbmsproject1() {
		db();
	}
	public dbmsproject1(String url, String username, String password) {
		
		this.url=url;
		this.username = username;
		this.password = password;
		
		db(url,username,password);
	}
	
	
	
	//getting connection to database;
	private void db(String url, String username,String password) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.err.println("My sql class not found");
//		}
		try {
			this.conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.err.println("Connection fails");
		}
	}
	
	
	
	
	private void db() {
//		try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//			System.err.println("My sql class not found");
//		}
		try {
			this.conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.err.println("Connection fails");
		}
	}
	// return the connection object
	
	public Connection getconnection() {
		return conn;
	}

}
