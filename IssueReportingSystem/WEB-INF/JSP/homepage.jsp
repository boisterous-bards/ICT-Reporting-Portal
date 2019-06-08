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

    <div class="islogin">

    <!-- Tells the servlet to redirect to the login page -->
    <form action="ReportIssue" method="POST">
       <input name="Login" type="submit" value="Sign in"/>
    </form>

   <!-- Original Code -->
   <!-- <a href="login.jsp">Sign in</a> -->
</div>

    <div class="isreg">
    <!-- Tells the servlet to redirect to the login page -->
    <form action="ReportIssue" method="POST">
       <input name="Register" type="submit" value="Register"/>
    </form>

    <!-- Original Code -->
    <!-- <a href="reg.jsp">Register</a> -->
</div>
	<div class="inner" id="top">
		
		<a href="https://www.newcastle.edu.au/" id="uon-logo-full" title="The University of Newcastle, Australia">
			<img src="images/logo.png">
		</a>
        <nav id="header-tools">
        	
        </nav>

	</div>

	<div  class="search" >
		
      <form>
      	
      	<input class="isearch" type="text" name="">
        <button class="bsearch">search</button>
      </form>

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
	
<div class="wrapped clear-fix">
<nav id="side-menu" class="body-menu">
	<ol>
    <li>a</li>
    <li>b</li>
    <li>c</li>
    <li>d</li>
    </ol>
</nav>
<div class="body-content">
<h1> Top 10 Articles</h1>	
<div class="message message-alert">
	<h1>question1</h1>
<p>We have received advice that on occasion some applicants have experienced issues when viewing the Job Vacancies page and/or an error message occurs that affects the application process. We are currently investigating these matters and we hope to resolve them soon.</p>
<p>We have received advice that on occasion some applicants have experienced issues when viewing the Job Vacancies page and/or an error message occurs that affects the application process. We are currently investigating these matters and we hope to resolve them soon.</p>



</div>
<div class="message message-alert">
	<h1>question1</h1>
<p>We have received advice that on occasion some applicants have experienced issues when viewing the Job Vacancies page and/or an error message occurs that affects the application process. We are currently investigating these matters and we hope to resolve them soon.</p>
<p>We have received advice that on occasion some applicants have experienced issues when viewing the Job Vacancies page and/or an error message occurs that affects the application process. We are currently investigating these matters and we hope to resolve them soon.</p>



</div>

</div>
</div>

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