package com.neoris.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaludoServlet extends HttpServlet {



	private static final long serialVersionUID = 3012538316106336163L;

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.getWriter().println("<h1>Hola desde el servlet</h1>");

		
		
		
	}
	
	
}
