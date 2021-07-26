package org.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//create table phbook(id int primary key auto_increment,fname varchar(20),lname varchar(20), email varchar(50), contact varchar(10));
public final class DbConnectionUtil {

	
	public static Connection openConnection(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	public static void closeConnection(Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
