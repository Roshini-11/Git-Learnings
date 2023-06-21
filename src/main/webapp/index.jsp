<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<form action=ButtonServlet method=post>
<table>
<tr>
<td>Enter a name : </td>
<td>
    <select id="prefix" name="prefix">
      <option value="Mr">Mr</option>
      <option value="Ms">Ms</option>
    </select>
    <input type = text name = "uname"></td>
</tr>

<tr>
<td>Gender : </td>
  <td><input type="radio" id="male" name="gender" value="Male">Male
 <input type="radio" id="female" name="gender" value="Female">Female
 <input type="radio" id="others" name="gender" value="Others">Others</td>
</tr>

<tr>
<td>Area of Interest :</td>
<td>
  <input type="checkbox" id="ui" name="interests" value="UI/UX">UI/UX
  <input type="checkbox" id="java" name="interests" value="JAVA Developer">JAVA Developer
  <input type="checkbox" id="dotnet" name="interests" value=".NET Developer">.NET Developer

</td>
</tr>

<tr>
<td>Upload Image : </td>
<td><input type="file" id="myFile" name="image"></td>
</tr>

<tr>
<td></td>
<td><input type = submit value = Submit></td>
</tr>

</table>
</form>
</body>
</html>
