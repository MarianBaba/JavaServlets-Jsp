package com.marian;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//int k = (int) req.getAttribute("k"); //PER FARE IL FETCH DEL DATO PASSATO ALL'INTERNO DELLA VARIABILE REQ ABBIAMO UN METODO: getAttribute
		
		//k *= k;
		
		//PrintWriter out = res.getWriter();
		//out.println("Result is " + k);
		
		//int k = Integer.parseInt(req.getParameter("k"));
		
		HttpSession session = req.getSession();
		
		int k = (int) session.getAttribute("k");
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		
		System.out.println("Sq called");
	}
}
