<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan"> <!-- QUI VENGONO USATI OGGETTI IMPLICITI -> gli oggetti request e response sono dati da default -->

<!-- NEI SERVLET PUOI SCRIVERE HTML IN CODICE JAVA, MENTRE NELLE JAVASERVER PAGES (JSP) SCRIVI CODICE JAVA NELLE PAGINE HTML -->

<%-- nei jsp ci sono 4 tipi di tag per scrivere codice Java:
1. <%@page import="" %> QUESTO E'USATO PER IMPORTARE PACKAGES -> si chiama DIRETTIVA
2. <%! %> QUESTO E' USATO PER SCRIVERE E DICHIARARE COSE AL DI FUORI DEL METODO PRINCIPALE -> si chiama DECLARATION
3. <% %> QUESTO E' PER SCRIVERE IL METODO PRINCIPALE -> si chiama SCRIPTLET
4. <%= %> QUESTO E' PER FARE IL DISPLAY SULLA PAGINA DI QUELLO CHE ABBIAMO SCRITTO -> si chiama EXPRESSION --%>


<% //QUALSIASI COSA SCRIVI ALL'INTERNO DI QUESTI SIMBOLI SARA' INTERPRETATO COME CODICE JAVA

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		out.print("Output :" + k);

	%>
</body>
</html>