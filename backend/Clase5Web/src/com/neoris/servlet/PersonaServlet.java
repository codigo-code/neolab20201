package com.neoris.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.descriptor.web.ServletDef;

public class PersonaServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		System.out.println(req.getParameter("nombre"));
		
		
		// modifico el nombre y le agrego Algo!
		
		String neo = req.getParameter("nombre") + ", Nerois";
		
		
		RequestDispatcher dips =  req.getRequestDispatcher("/MuestroPersona.jsp");
		
		req.setAttribute("persona", neo);
		
		dips.forward(req, resp);
		
		resp.getWriter().println("llegaste al servlet persona");
	}
}


