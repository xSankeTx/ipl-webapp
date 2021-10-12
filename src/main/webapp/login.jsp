<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>IPL 2021</title>
   <link rel="stylesheet" href="loginstyle.css">

</head>
<body>
   <div class="center">
      <h1>Login</h1>
      <form action="home" method="get">
         <div class="txt_field">
            <input type="text" name="un" required>
            <span></span>
            <label>Username</label>
         </div>
         <div class="txt_field">
            <input type="password" name="pw" required>
            <span></span>
            <label>Password</label>
         </div>
         <input type="submit" value="Login">
      </form>
      <div class="space"></div>
   </div>
</body>
</html>