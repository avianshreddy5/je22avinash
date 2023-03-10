package com.demo;

import java.sql.*;

public class DHandler {
	public static void insertData(String data) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pwd = "system";
		String sql = "INSERT INTO data_table VALUES(?)";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, un, pwd);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, data);
		ps.executeUpdate();
	}
}
