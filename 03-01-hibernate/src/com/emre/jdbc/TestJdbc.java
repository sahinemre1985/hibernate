package com.emre.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		//important note: to make pdb connection successful we have modify listener.ora file
		//"$ORACLE_HOME/network/admin/listener.ora
		//added this line : USE_SID_AS_SERVICE_listener=on
		//after run below command as admin
		//lsnrctl reload
		
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orclpdb";
		
		String user = "personal";
		String pass = "PERSONAL";

		
		
		try {
			System.out.println("connectin to database |"+jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
//			Connection myConn = DriverManager.getConnection(jdbcUrl);
			
			System.out.println("connection succesful");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
