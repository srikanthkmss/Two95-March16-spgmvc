
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align=center>Welcome to Paradise 5 Star</h1>
<form method=POST action="/srikanth/paradise">
<table>
  <tr><td>Name:</td><td><input type = text name = name /></td></tr>
  <tr><td>Mobile :</td><td><input type = text name = mobile /></td></tr>
  <tr><td>E-mail : </td><td><input type = text name = email /></td></tr>
  <tr><td>CheckIn Date : </td><td><input type = text name = da /></td></tr>
  <tr><td>Suite Type : </td><td><select name = "roomtype" multiple>
            <option>Delux Rs.2000/24hrs</option>
            <option>King Rs.3500/24hrs</option>
            <option>Suite Rs.5000/24hrs</option>
            <option>RoyalSuite Rs.6500/24hrs</option>
                            </select></td></tr>
<tr><td> Gender: <input type="radio" name="sex" value="Male" >MALE<input type= "radio" name="sex" value="Female">FEMALE
<input type="radio" name="sex" value="Other">OTHER </td></tr>
<tr><td>Door no. : </td><td><input type = text name = address.doorno /></td></tr>
<tr><td>City : </td><td><input type = text name = address.city /></td></tr>
<tr><td>State : </td><td><input type = text name = address.state /></td></tr>
<tr><td>Country : </td><td><input type = text name = address.country /></td></tr>
<tr><td>ZIPCODE : </td><td><input type = text name = address.zipcode /></td></tr>
  <tr><td colspan = 2 align =center><input type = submit value = CheckIn /></td></tr>
</table>
</form>
</body>
</html>
