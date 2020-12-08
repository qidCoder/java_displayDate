<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- link in the style and js sheets -->
        <link rel="stylesheet" type="text/css" href="css/datestyle.css">
                <script type="text/javascript" src="js/date.js"></script>


</head>
<body>
<h1>Current Date:</h1>

<p><c:out value="${currentDate}"/></p>

</body>
</html>