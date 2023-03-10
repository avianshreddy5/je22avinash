package com.admin;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.*;

import com.db.QuestionBank;
@WebServlet("/a")
public class addQuestion extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String qid = req.getParameter("qid");
		String q = req.getParameter("q");
		String opa = req.getParameter("opA");
		String opb = req.getParameter("opB");
		String ans = req.getParameter("ans");

		// System.out.println(qid + "\n" + q + "\n" + opa + "\n" + opb + "\n" + ans);
		try {
			QuestionBank.addQuestion1(qid, q, opa, opb, ans);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
