package com.demo;

import java.io.IOException;

import javax.servlet.http.*;

public class firstservlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		String d=req.getParameter("data");
		try {
			DHandler.insertData(d);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
