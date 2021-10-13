  
<!doctype html>
<html lang= "en">
<head>
  <title>IPL Cricket</title>
    <meta character= "UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="side.css">
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-light fixed-top">
        <div class="container">
            <!--<a class="navbar-brand" href="#">BEHIND THE VOWES</a>-->
   
			<a href="homepage.jsp">
              <img src="logo.jfif" class="img-responsive" alt="" width="170" height="60">
            </a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="nav nav-tabs" id="myTab" role="tablist">
				<li class = "nav-item>
						
				</li>
                <li class="nav-item active">
                    <a class="nav-link" href="AddPlayer.jsp">Add Player Details<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="<%=request.getContextPath()%>/view">View Player Details</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="UpdatePlayer.jsp">Update Player Details</a>
                </li>
				
				<li class="nav-item">
                    <a class="nav-link" href="DeletePlayer.jsp">Delete Player Details</a>
                </li>
                
                 <li class="nav-item">
                    <a class="nav-link" href="login.jsp">Log Out</a>
                 </li>
          </ul>
        </div>
        </div>
    </nav>
    
      <br>
      <br>
      <br><br>
      <h1>Enter Player details</h1>
      <form action="update" method="post">
        name<br>
        <input type="name" name="n1"/>
        <br>team<br>
        <input type="name" name="n2"/>
        <br> Previous number<br>
        <input type="name" name="n3"/>
        <br>salary<br>
        <input type="name" name="n4"/>
        <br>ads<br>
        <input type="name" name="n5"/>
        <br>matches<br>
        <input type="name" name="n6"/>
        <input type="submit" value="Click" name="update"/>
        </form>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>



