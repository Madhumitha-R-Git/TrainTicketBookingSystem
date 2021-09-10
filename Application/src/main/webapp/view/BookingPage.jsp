<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LastPage</title>
<link rel="StyleSheet" href="css/FinalPage.css">
<script>
function myfn()
{
alert("your ticket is booked");
}
</script>
</head>
<body background-color=#4B6587>
<center>
<h1>Tickets are available!<h1>
<center>
<form action="/">
 <Button type = "submit"  id="checkBt1" onclick=myfn()>Book</Button>
 <Button type = "submit"  id="checkBt2">Cancel</Button>
</form>

</body>
</html>