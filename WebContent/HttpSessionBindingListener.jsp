<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="shangguigu_JAVAWEB09_Listener.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		User user = new User();
		session.setAttribute("user", user);
		System.out.println("---------");
		session.removeAttribute("user");
	
	%> --%>
	<%
		User user = (User)session.getAttribute("user");
		if(user == null){
			user = new User();
			user.setName("james");
			session.setAttribute("user", user);
			System.out.print("session中的user属性被创建了"+user.getName());
		}else{
			System.out.println(user.getName()+"已经存在了");
		}
	%>


</body>
</html>