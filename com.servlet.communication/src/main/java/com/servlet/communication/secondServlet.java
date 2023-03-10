package com.servlet.communication;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet("/s2")
public class secondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// resp.sendRedirect("s1");
		// System.out.println("socond servlet ");
		// String d = (String) req.getAttribute("data");
		// System.out.println("data entered=" + data);
		// below code for 1st app of sending the data by httsSession()
		// resp.getWriter().print("Date:" + d);
		// below code for the 2nd app of sending the data
		Cookie[] cooks = req.getCookies();
//		String f=cooks[0].getValue();
//		resp.getWriter().print("data:"+f);
		// if multiple cookies are there then we have to make use of below process
		for (Cookie c : cooks) {
			if (c.getName().equals("data")) {
				resp.getWriter().print("data:" + c.getValue());
			}
		}

	}
}
