<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.html"></jsp:include>

<table>
<tr>
<th>product id</th>
<th>pname</th>
<th>unitprice</th>

<th>stock</th>
<th>category</th></tr>

<%
List<Product> productlist=(List<Product>) request.getAttribute("productlist");
for(Product p:productlist){

%>
<tr>
<td><%=p.getPid() %></td>
<td><%=p.getPname() %></td>
<td><%=p.getUnitprice() %></td>
<td><%=p.getStock()%></td>

<td><%=p.getCategory()%></td>
</tr>




<%} %>
</table>
</body>
</html>