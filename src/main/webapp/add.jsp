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

<% //QUALSIASI COSA SCRIVI ALL'INTERNO DI QUESTI SIMBOLI SARA' INTERPRETATO COME CODICE JAVA

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		out.print("Output :" + k);

	%>
</body>
</html>