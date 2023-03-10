

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	String path="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="system";
	Connection con=null;
	PrintWriter pw=null;
	PreparedStatement pstmt=null;
	String query="select * from Bank_Details where AccNo=? And password=?";
	ResultSet rs=null;


	public void init()
	{
		try 
		{
			Class.forName(path);
			con=DriverManager.getConnection(url, user,pass);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	public void service(HttpServletRequest req,HttpServletResponse res)
	{
		try 
		{
			String accno=req.getParameter("accno");
			String password=req.getParameter("password");


			pw=res.getWriter();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, accno);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				int accno1=rs.getInt("accno");
				String name=rs.getString("name");
				
				String passw=rs.getString("password");
				String email=rs.getString("email");
				int bal=rs.getInt("balance");
				
				pw.println(accno1+" "+name+" "+passw+" "+email+" "+ bal);
			}
			else
			{
				res.sendRedirect("/invalid.html");
			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}


	}
	public void destroy()
	{
		try 
		{
			con.close();
			pstmt.close();
			pw.close();
			rs.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
