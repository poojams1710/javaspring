<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>

<body>
	<h3>${msg }</h3>
	<h1>Congratulation! your form successsfully submit</h1>
	<h2>Detail submitted by u</h2>
	<table>
		<tr>
			<td>Student name:</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby:</td>
			<td>${student1.studentHobby }</td>
		</tr>
		<tr>
			<td>Student Mobile:</td>
			<td>${student1.studentMobile}</td>
		</tr>
		<tr>
			<td>student DOB</td>
			<td>${student1.studentDOB }</td>
		</tr>
		<tr>
			<td>student skills</td>
			<td>${student1.studentSkills }</td>
		</tr>
		<tr>
			<td>student Address</td>
			<td>country:${student1.studentAddress.country}</td>
			<td>city:${student1.studentAddress.city }</td>

			<td>street:${student1.studentAddress.street }</td>
	</table>

</body>
</html>