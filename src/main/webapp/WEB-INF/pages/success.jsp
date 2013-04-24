<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="pink">
	<form action="submit.do">

		<center>
			<h1>Success page</h1>
			Message:<%=request.getAttribute("model")%>
			</br> Message:${model}
		</center>
		<center>
			<h1>LIBRARY MODULE</h1>
		</center>
		<table>
			<tr>
				<td>RegNo:</td>
				<td><input type="text" name="RegNo" /></td>
			</tr>
			<tr>
				<td>FirstName:</td>
				<td><input type="text" name="fname" /></td>
			</tr>

			<tr>
				<td>LastName :</td>
				<td><input type="text" name="lname" /></td>
			</tr>
			<tr>
				<td>mailId :</td>
				<td><input type="text" name="mail" /></td>
			</tr>

			<tr>
				<td>Branch :</td>
				<td style="width: 174px;"><input type="text" name="branch" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="save   "></td>
			</tr>



		</table>


	</form>
</body>
</html>