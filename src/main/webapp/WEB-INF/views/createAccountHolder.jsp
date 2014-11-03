<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Création d'un compte utilisateur</title>

<style>
.error {
       color: #ff0000;
}
</style>

</head>

<body>
	<form:form method="post" action="createAccountHolder" commandName="accountHolderModel">
		<table>
			<tr>
				<td><form:label path="accountHolderUsername">First Name</form:label></td>
				<td><form:input path="accountHolderUsername" /></td>
				<td><form:errors path="accountHolderUsername" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="accountHolderLastname">Last Name</form:label></td>
				<td><form:input path="accountHolderLastname" /></td>
				<td><form:errors path="accountHolderUsername" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="accountHolderAdress">Address</form:label></td>
				<td><form:input path="accountHolderAdress" /></td>
			</tr>
			<tr>
				<td><form:label path="accountHolderCity">City</form:label></td>
				<td><form:input path="accountHolderCity" /></td>
			</tr>
			<tr>
				<td><form:label path="accountHolderZipCode">ZipCode</form:label></td>
				<td><form:input path="accountHolderZipCode" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Contact" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>