package com.project.dbhandler;

import java.sql.*;

public class Validator {
	public static boolean validate(String email, String webPass) {
		String dbPass=fetchData(email);
		if (webPass.equals(dbPass)) {
			return true;
		} else {
			return false;
		}
	}

	public static String fetchData(String email) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "system";
		String sql = "SELECT pass FROM user_index WHERE email=?";
		String db_pass = "";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			db_pass=rs.getString(1);
			
		} catch (Exception e) {
			System.out.println("problem in fetching data");
			e.printStackTrace();
		}
		return db_pass;
	}
}
