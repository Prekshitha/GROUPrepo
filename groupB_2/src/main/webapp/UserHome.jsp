<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="service.UsersDao"%>
<%@page import="model.Users"%>
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

<%String empid=(String) session.getAttribute("empid");%>
<% String msg=(String)request.getAttribute("msg");
if(msg==null){
msg="";
	
}
Users u=new UsersDao().getAllInfo(empid);
%>
<%=msg %>
<h1>welcome <%=empid%></h1>
Name:<%=u.getName()%><br>
mail:<%=u.getEmailid()%><br>
Contact:<%=u.getContactno()%>





</body>
</html>

</body>
</html>