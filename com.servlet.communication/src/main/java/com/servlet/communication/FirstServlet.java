package com.servlet.communication;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/s1")
public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("first servlet excuting");

		String d = req.getParameter("data");
		// for 2nd app of communication below
		// req.setAttribute("data", d);
		// RequestDispatcher rd = req.getRequestDispatcher("s2");
		// rd.forward(req, resp);
		// resp.sendRedirect("s2");
		// below is 1st app of sending data

//		HttpSession sess = req.getSession();
//		sess.setAttribute("data", d);
//		resp.sendRedirect("s2");
		Cookie c = new Cookie("data", d);
		resp.addCookie(c);
		resp.sendRedirect("s2");

	}
}
