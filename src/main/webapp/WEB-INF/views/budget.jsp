<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Prévision de budget</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Home Page">
    <meta name="author" content="snake984">
    
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
	<style>
		body {
  padding-top: 50px;
  }
	</style>
	
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
              <li class="active"><a href="/">Accueil</a></li>
              <li><a href="/gestiondepenses/accountHolders">Gestion des utilisateurs </a></li>
              <li><a href="/gestiondepenses/budget">Gestion des dépenses</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

	<div class="container">
		<p>Bienvenue dans prévision de budget</p>
	</div>

	<p>Liste des comptes :</p>

	<table border="1">
		<tr>
			<th>Label</th>
			<th>Budget</th>
		</tr>
		<c:forEach var="account" items="${Account}">
			<tr>
				<td><c:out value="${account.accountLabel}" /></td>
				<td><c:out value="${account.initialBudget}" /></td>
			</tr>
		</c:forEach>
	</table>

	<!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="<c:url value="resources/bootstrap/dist/js/bootstrap.min.js" />"></script>
	
</body>
</html>