package com.project.login;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.project.dbhandler.Validator;

@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		// String d=req.getParameter("login");
		// System.out.println("control came to login servlet");
		try {
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			boolean login_status = Validator.validate(email, pass);
			if (login_status == true) {
				// System.out.println("login succesfully");
				resp.sendRedirect("home.html");
			} else {
				// System.out.println("login failed");
				resp.sendRedirect("login.html");
			}
		}

		catch (Exception e) {
			System.out.println("problems");
		}

	}
}
