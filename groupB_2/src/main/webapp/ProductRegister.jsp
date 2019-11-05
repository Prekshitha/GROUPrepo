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

<form action="ProductRegister" method="post">

<table>
<tr>
<th>Enter product id:</th>
<td><input type="text" name="pid" id="pid"></td>
</tr>

<tr>
<th>Enter product name:</th>
<td><input type="text" name="pname" id="pname"></td>
</tr>

<tr>
<th>Enter unitprice:</th>
<td><input type="text" name="unitprice" id="unitprice"></td>
</tr>

<tr>
<th>Enter stock:</th>
<td><input type="text" name="stock" id="stock"></td>
</tr>

<tr>
<th>Category:</th>
<td><select name="category" id="category">
<option value="Electronics">Electronics</option>
<option value="Fashion">Fashion</option>
<option value="utensils">Utensils</option>
</select></td>
</tr>

<tr>
<th colspan="2">
<td>
<input type="submit" value="insert">
<input type="reset" value="clear">
</td>
</tr>
</table>


</form>

</body>
</html>