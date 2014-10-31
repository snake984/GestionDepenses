<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Mon compte</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Home Page">
    <meta name="author" content="snake984">
    
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
	<style>
		body {
  padding-top: 50px;
  }
	</style>
	<title>Contact Manager</title>
</head>

<body>
    
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="/">GestionDepenses</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li><a href="/">Accueil</a></li>
              <li class="active"><a href="/account">Utilisateurs</a></li>
              <li><a href="/budget">Prévision de budget</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

	<div class="container">
	
		<!-- <p>Liste des utilisateurs : </p> -->
		<!-- account userName : account.getName() -->
		
	 <a href="/createAccountHolder">Créer un compte utilisateur</a> 
	</div>
	
	    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="<c:url value="resources/bootstrap/dist/js/bootstrap.min.js" />"></script>
	
</body>
</html>