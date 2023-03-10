package com.admin;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/log")
public class loginservlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String webmail = req.getParameter("email");
		String webpass = req.getParameter("pass");

		String amail = "reddyavinash679@gmail.com";
		String apass = "avinash@123";

		if (amail.equals(webmail) && apass.equals(webpass)) {
			resp.sendRedirect("addQ.jsp");
		} else {
			resp.sendRedirect("index.jsp");
		}
	}
}
