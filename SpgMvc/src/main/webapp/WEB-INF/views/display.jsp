<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align = center>CheckedIn Success</h1>
<table align = center border = 2 width = 250>
<tr><td>Name : </td><td>${cust.name}</td></tr>
<tr><td>Mobile : </td><td>${cust.mobile}</td></tr>
<tr><td>E-mail : </td><td>${cust.email}</td></tr>
<tr><td>Date of Checkin : </td><td>${cust.da}</td></tr>
<tr><td>Room Types :</td><td>${cust.roomtype}</td></tr>
<tr><td>Gender :</td><td>${cust.sex}</td></tr>
<tr><td>Address : </td><td>${cust.address}</td></tr>
</table>
</body>
</html>
