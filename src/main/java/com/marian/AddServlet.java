package com.marian;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { //SE SCRIVIAMO DOPOST IL METODO VERRA' CHIAMATO SOLAMENTE CON IL METODO POST, si può fare la stessa cosa con doGet
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		//SESSION MANAGEMENT -> PER CONDIVIDERE DATI FRA SERVLET
		
		
		res.sendRedirect("sq?k=" + k); //URL REDIRECTING
		
		
		//req.setAttribute("k", k); //se vogliamo passare un dato da un servlet a un altro possiamo metterlo all'interno di un ATTRIBUTI DELLA VARIABILE REQUEST (REQ)
		
		
		
		//request dispatcher per chiamare un altro servlet da qui -> QUINDI QUESTO E' IL MODO PER CHIAMARE UN SERVLET DA UN SERVLET
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
	}
}