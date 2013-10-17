<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of users</title>
</head>
<body>

	<% String filePath=application.getRealPath("WEB-INF/users.xml"); 
		
		com.pc.wsd.SocialApp app = new com.pc.wsd.SocialApp();
		app.setFilePath(filePath);
		
		System.out.println(app.getUsers());
	
	%>
	<!-- 
	<jsp:useBean id="diaryApp" class="com.pc.wsd.SocialApp" scope="application">
    	<jsp:setProperty name="socialApp" property="filePath" value="<%=filePath%>"/>
	</jsp:useBean>-->

</body>
</html>