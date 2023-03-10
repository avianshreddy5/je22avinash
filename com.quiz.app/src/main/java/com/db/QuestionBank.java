package com.db;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class QuestionBank {
	public static void addQuestion1(String qid, String q, String opA, String opB, String ans) {
		@SuppressWarnings("unused")
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "system";
		String sql = "insert into addq values(?,?,?,?,?)";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(qid));
			ps.setString(2, q);
			ps.setString(3, opA);
			ps.setString(4, opB);
			ps.setString(5, ans);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public static void fetchQues() {
	@SuppressWarnings("rawtypes")
	public static ArrayList fetchQues(int i) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pass = "system";
		String sql = "select * from addq where QUESTION_ID= "+i;
		ArrayList<String> al = new ArrayList<String>();
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, un, pass);
			java.sql.Statement St = con.createStatement();
			ResultSet rs = St.executeQuery(sql);
			while (rs.next()) {
				// System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
				// rs.getString(3) + " " + rs.getString(4));
				String s = rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4);
				al.add(s);
			}
			System.out.println(al);
		} catch (Exception e) {
			System.out.println("problem inserting question");

			e.printStackTrace();
		}
		return al;
	}
}
