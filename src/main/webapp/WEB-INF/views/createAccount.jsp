<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Création d'un compte</title>

<style>
.error {
       color: #ff0000;
}
</style>

</head>

<body>
	<form:form method="post" action="createAccount" commandName="accountModel">
		<table>
			<tr>
				<td><form:label path="accountLabel">Account name</form:label></td>
				<td><form:input path="accountLabel" /></td>
				<td><form:errors path="accountLabel" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="initialBudget">Initial budget</form:label></td>
				<td><form:input path="initialBudget" /></td>
				<td><form:errors path="initialBudget" cssClass="error"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add account" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>