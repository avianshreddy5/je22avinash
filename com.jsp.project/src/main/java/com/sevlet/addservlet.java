package com.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojos.Sum;

@WebServlet("/a")
public class addservlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// int num =req.getParameter("n1");
		int num1 = Integer.valueOf(req.getParameter("n1"));
		int num2 = Integer.parseInt(req.getParameter("n2"));
		int res = Sum.findsum(num1, num2);
		// resp.getWriter().print("sum=" + res);
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head></head>");
		out.print("<body style='background-color:yellow;'>");
		out.print("</h1> Result=" + res);
		out.print("</body>");
		out.print("</html>");
	}
}
