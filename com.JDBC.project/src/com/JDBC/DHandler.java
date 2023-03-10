package com.JDBC;

import java.sql.*;

public class DHandler {
	public static void insert(int roll, String name, int yop, float cgp) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pass = "system";
		String sql = "insert into student_info values(?,?,?,?)";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, un, pass);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, roll);
		ps.setString(2, name);
		ps.setInt(3, yop);
		ps.setFloat(4, cgp);
		ps.executeUpdate();

	}

}
