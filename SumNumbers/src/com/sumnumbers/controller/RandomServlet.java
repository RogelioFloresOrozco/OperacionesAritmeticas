package com.sumnumbers.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sumnumbers.model.Operations;

/**
 * Servlet implementation class RandomServlet
 */
@WebServlet("/RandomServlet")
public class RandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomServlet() {
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
		int[] ranNum = Operations.Random(num);
		
		String btns = "<input type=\"submit\" value=\"Accept\">";
		btns += "<input type=\"submit\" value=\"Delete\">";
		btns += "<input type=\"submit\" value=\"Update\">";
		
		response.getWriter().write("<html>");
		response.getWriter().write("<head>");
		response.getWriter().write("<title>Rand</title>");
		response.getWriter().write("</head>");
		response.getWriter().write("<body>");
		
		response.getWriter().write("<table border=\1\">");
		response.getWriter().write("<thead>");
		response.getWriter().write("<tr>");
		response.getWriter().write("<th>Element</th><th>Number</th><th>Actions</th>");
		response.getWriter().write("</tr>");
		response.getWriter().write("</thead>");
		response.getWriter().write("<tbody>");
		for(int i=0 ; i<ranNum.length ; i++)
		{
			response.getWriter().write("<tr>");
			response.getWriter().write("<td>"+(i+1)+"</td><td>"+ranNum[i]+"</td><td>"+btns+"</td>");
			response.getWriter().write("</tr>");
		}
		
		response.getWriter().write("</tbody>");
		response.getWriter().write("</table>");
		response.getWriter().write("<a href='index.html'>Home</a>");
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");
		
	}

}