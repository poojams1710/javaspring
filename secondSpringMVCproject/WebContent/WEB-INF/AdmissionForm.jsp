<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>

<body>

     <h1> Student Admission Form for Engineering Student </h1>
              <form action="/secondSpringMVCproject/submitAdmissionForm.html" method="post">
                   <p>
                       Student Name:<input type="text" name="studentname"  />
                   </p>
                    <p>
                             Student hobby:<input type="text"  name="studenthobby"  />
                    </p>
                    <input type="submit" value="click to submit" />
                </form>
</body>
</html>
