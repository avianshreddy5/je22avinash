package com.project.register;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.project.dbhandler.RegisterToDb;
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse resp)
{
	String mail=req.getParameter("email");
	String pass=req.getParameter("pass");
	String add=req.getParameter("address");
	String gen=req.getParameter("gender");
	try {
		RegisterToDb.insertData(mail,pass,add,gen);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(mail+" "+pass+" "+add+" "+gen);
	
}
}
