<%-- 
    Document   : template
    Created on : Apr 18, 2017, 4:44:46 PM
    Author     : Felipe
--%>

<%@tag description="Template principal" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title"%>
<%@attribute name="isLoggedIn"%>

<!DOCTYPE html>
<html lang="en">
<head>

<base href="${pageContext.request.contextPath}/">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" type="image/png" href="resources/img/favicon.png" />

<title>${title}</title>

<!-- CSS -->
<link rel="stylesheet" href="resources/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="resources/css/style.css"></link>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
	
</head>
<body>
<div class="container">

      <!-- Static navbar -->
      <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-left" href="index.jsp"><img class="logo"
							src="resources/img/logo.png"></img></a>
            <a class="navbar-brand left" href="index.jsp">Dice Roller</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
              <li><a href="index.jsp">Início</a></li>							
			  <c:if test="${isLoggedIn}">
				<li><a href="logout">Logout</a></li>
			  </c:if>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>
      
	<main id="content" class="container"> <jsp:doBody /> </main>
	
	<!-- footer -->
	<footer class="footer">
      <div class="container">
        <p class="text-muted">Felipe Kosouski - UTFPR | 2017</p>
      </div>
    </footer>
</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/changeImage.js"></script>
</body>
</html>
