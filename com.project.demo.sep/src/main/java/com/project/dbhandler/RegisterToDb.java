package com.project.dbhandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterToDb{

	public static void insertData(String email,String password,String address,String gen) throws Exception
	{
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String un="system";
		String pass="system";
		String sql="INSERT INTO user_index values(?,?,?,?)";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,un,pass);
		
		PreparedStatement	ps=con.prepareStatement(sql);	
		ps.setString(1, email);
		ps.setString(2, password);
		ps.setString(3, address);
		ps.setString(4, gen);
		ps.executeUpdate();
	}
}
