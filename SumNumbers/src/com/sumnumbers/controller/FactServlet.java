package com.sumnumbers.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sumnumbers.model.Operations;

/**
 * Servlet implementation class FactServlet
 */
@WebServlet("/FactServlet")
public class FactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FactServlet() {
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
		int num = Integer.parseInt(request.getParameter("num1"));
		int fact = Operations.factNumbers(num);
		
		response.getWriter().write("<html>");
		response.getWriter().write("<head>");
		response.getWriter().write("<title>Factorial</title>");
		response.getWriter().write("</head>");
		response.getWriter().write("<body>");
		response.getWriter().write("<p>The result is: "+fact+"</p>");
		response.getWriter().write("<a href='index.html'>Home</a>");
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");
	}

}
