<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table  cellpadding="10">
<tr>

	<th> Name</th>
	<th> Details</th>

</tr>
	<c:forEach var="product_list" items="${product_list}">
		<tr>
	
		   <td>${product_list.name}</td>
		   <td>${product_list.longDescription}</td>
		   
		  
		</tr>
	</c:forEach>
</table>
</body>
</html>