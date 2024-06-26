package javacollect.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Set the link to access this Servlet in here
@WebServlet(urlPatterns = {"/any/*"})

public class AsteriskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public AsteriskServlet() {
		
	}	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();		
		out.println("<html>");
		out.println("<head><title>Asterisk</title></head>");
		out.println("<body><h3>Hi, your URL match /any/*</h3></body>");
		out.println("</html>");
	}	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      this.doGet(req, resp);
	}
}
