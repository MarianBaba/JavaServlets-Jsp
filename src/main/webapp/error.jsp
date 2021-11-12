<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%> <!-- abbiamo specificato che questa pagina è una pagina di errore, quindi avremo l'oggetto exception -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Error
	<%= exception.getMessage() %> 
</body>
</html>