package edu.npu.courseapp.dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {
	private static Connection con;
	private int QUERIES = 0;
	private static boolean conFree = true;
	private static String DatabaseURL = "jdbc:mysql://localhost:3306/whereToBuy";
	private static String  DatabaseDRIVER = "com.mysql.jdbc.Driver";
	private static String DatabaseUser = "root";
	private static String DatabasePassword = "";
	
	
	public static Connection DBConnection () throws Exception{
		try  {               
			// Load the driver
			Class.forName(DatabaseDRIVER).newInstance();
			
			// Get the connection
			con = DriverManager.getConnection(DatabaseURL,DatabaseUser,DatabasePassword);

			
		} catch (Exception ex) {
			throw new Exception("Couldn't open connection to database: " + ex.getMessage());
		}       
		return con;
	}
	
	
	public void remove () {
		try {
			con.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	protected Connection getConnection() {
		this.QUERIES = ++QUERIES;
		return con;
	}
	
	
	protected synchronized void releaseConnection() {
		remove();
	}
	
	
	public int getNumQueries() {
		return QUERIES;
	}
}