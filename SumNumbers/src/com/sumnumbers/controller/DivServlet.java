package com.sumnumbers.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sumnumbers.model.Operations;

/**
 * Servlet implementation class DivServlet
 */
@WebServlet("/DivServlet")
public class DivServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DivServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Operations opr = new Operations();
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		double div = opr.divNumbers(num1, num2);
		
		response.getWriter().write("<html>");
		response.getWriter().write("<head>");
		response.getWriter().write("<title>Div</title>");
		response.getWriter().write("</head>");
		response.getWriter().write("<body>");
		response.getWriter().write("<p>The result is: "+div+"</p>");
		response.getWriter().write("<a href='index.html'>Home</a>");
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");
	}

}
