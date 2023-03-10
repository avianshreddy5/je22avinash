package magic;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class secondservlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		ServletContext ct = getServletContext();
		String manager = ct.getInitParameter("manager");
		System.out.println("manager for servlet 2:" + manager);

		ServletConfig con = getServletConfig();
		String lead = con.getInitParameter("lead");
		System.out.println("lead for servlet @:" + lead);

	}
}
