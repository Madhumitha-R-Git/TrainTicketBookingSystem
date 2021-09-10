<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin login</title>
<link rel = "StyleSheet" href="css/admin.css">
<script>
function Checkfn()
{
var name = document.getElementById("user").value;
var pass = document.getElementById("pwd").value;
if(name==="madhu" && pass==="123")
window.location.href="Mainpage";
else
alert("Invalid credentials");
}
</script>
</head>
<body>
<div class = login>
    <center>
        <h4>LOGIN</h4>
        <form action="" autocomplete="off" method="post">
            <label>Username</label>
            <input type = "text" name="username" id="user" ><br>
            <label>Password</label>
            <input type = "password" name="pswrd" id="pwd"><br>
            <button type = "button"  id="bt" onclick="Checkfn()">SignUp</button>
        </form>
    </center>
</div>

</body>
</html>