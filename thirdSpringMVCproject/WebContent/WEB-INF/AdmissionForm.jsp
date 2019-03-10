<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<body>
	<h1>${msg}</h1>

	<h1>Student Admission Form for Engineering Student</h1>
	<form:errors path="student1.*" />
	<form action="/thirdSpringMVCproject/submitAdmissionForm.html"
		method="post">
		<table>
			<tr>
				<td>Student Name:<input type="text" name="studentName" />
				</td>
			</tr>
			<tr>
				<td>Student hobby:<input type="text" name="studentHobby" />
				</td>
			<tr>
				<td>Student Mobile:<input type="text" name="studentMobile" />
				</td>
			</tr>
			<tr>
				<td>Student DOB:<input type="text" name="studentDOB" /></td>
			</tr>
			<tr>
				<td>Student skills:<select name="studenSkills" multiple>
						<option value="core java">core java</option>
						<option value="spring">spring</option>
						<option value="jsp">jsp</option>
				</select></td>
			</tr>
			<tr>
				<td>Student Address</td>
			</tr>
			<tr>
				<td>country name:<input type="text"
					name="studentAddress.country" /></td>
				<td>city:<input type="text" name="studentAddress.city" /></td>

				<td>street:<input type="text" name="studentAddress.street" /></td>
			</tr>



			<tr>
				<td><input type="submit" value="click to submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>
