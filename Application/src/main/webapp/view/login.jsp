<html>
<head>
<title>LoginPage</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>
    <center>
       <form action ="CheckUser" method="post">
       <div class = "form">
        <label>Idnum</label>
        <input type="text" name="id" class="uname" placeholder="Enter idnum" required autocomplete="off"><br>
        <label class="ps">Password</label>
        <input type = "password" name="pswd" class="pd" placeholder="Enter password" required autocomplete="off"><br>
        <input type="submit" class="btn" value="Login" onclick="Checkusr">
        <input type="submit" class="btn" value="Register" onclick="Addusr">
       </div>
       </form>
    </center>
</body>
</html>







