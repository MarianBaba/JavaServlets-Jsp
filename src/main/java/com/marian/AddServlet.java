package com.marian;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException { //SE SCRIVIAMO DOPOST IL METODO VERRA' CHIAMATO SOLAMENTE CON IL METODO POST, si può fare la stessa cosa con doGet
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		PrintWriter out = res.getWriter();
		
		out.println(k);
		
	}
	
	
}
