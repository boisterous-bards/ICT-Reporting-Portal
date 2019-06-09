<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.Map" %>
<%@page import="java.util.Map.Entry" %>
<%@page import="UserBean.User" %>
<jsp:useBean id="user" class="UserBean.User" scope="session"/>

<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="home.css">
</head>
<body>

<main id="panel">
<header id="uon-header">

    
</div>
	<div class="inner" id="top">
		
		<a href="https://www.newcastle.edu.au/" id="uon-logo-full" title="The University of Newcastle, Australia">
			<img src="images/logo.png">
		</a>
        <nav id="header-tools">
        	
        </nav>

	</div>

	
	
</header>
<div id="page-header" class="uon-landing-page-header" style="background-image: url(images/circle.png);">
	<div class="header-tint">
		<div class="inner">
			<span class="page-header-title"></span>
		</div>
	</div>

</div>
<div id="uon-body">
	


</div>

<div class="wrapped clear-fix">
	
	<table align="center" border="0">
		<tr>
			<td ><input type="submit" value="username" class="table-menu"></td>
			<td><input type="text" name="name" class="table-menu"></td>
		</tr>
		<tr>
			<td ><input type="submit" value="password" class="table-menu"></td>
			<td><input type="text" name="password" class="table-menu"></td>
		</tr>
	</table>

    <!-- Did a mod here to redirect using the servlet (L.W.) -->
	<form action="ReportIssue" method="post">
		<input name="Article" align="center" type="submit" value=" Sign in" style="color:#BC8F8F" class="issignin">
	</form>

</div>
	
<section id="page-footer"><div class="inner clearfix"><div class="col w50 uon-page-footer-contacts">

<div class="uon-page-footer-contacts-list">
   
</div>
</div>
</div>
</div>
</section>

<footer id="uno-footer">
	
</footer>
</main>
	

</body>
</html>















