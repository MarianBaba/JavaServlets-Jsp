package com.marian;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
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
		
		//HttpSession session = req.getSession();
		
		//session.removeAttribute("k"); usato per rimuovere dati dalla sessione
		//SOLITAMENTE LA SESSIONE VIENE USATA PER IL LOGIN
		
		//int k = (int) session.getAttribute("k");
		
		//proviamo ad accettare il cookie
		int k = 0;
		Cookie cookies[] = req.getCookies(); //il client ti da TUTTI I COOKIE, sta a te definire di quale hai bisogno
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		
		System.out.println("Sq called");
	}
}
