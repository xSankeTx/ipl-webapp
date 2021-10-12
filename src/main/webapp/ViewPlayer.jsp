<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="model.Player"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang= "en">
<head>
  <title>IPL Cricket</title>
    <meta character= "UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <!-- <link rel="stylesheet" href="style.css"> -->
    <link rel="stylesheet" href="side.css">
    <style>
        .carousel-item{
    height: 100vh;
    min-height: 300px;
    background: no-repeat center center scroll;
    -webkit-background-size: cover;
    background-size: cover;
}

nav{
    width: 100%;
    height: 80px;
    background-color: white;
}

ul li a{
    font-size: 15px;
    font-weight: bold;
}


/*.navbar-light .navbar-brand{
    color: black ;
    font-size: 25px;
    text-transform: uppercase;
    font-weight: bold;
    letter-spacing: 2px;
}*/

.navbar-light .navbar-nav .active>.nav-link, .navbar-light .navbar-nav .nav-link.active, .navbar-light .navbar-nav .nav-link.show, .navbar-light .navbar-nav .show>
.nav-link{
    color: white;
}

.navbar-light .navbar-nav .nav-link{
    color: white;
}

.navbar-light .navbar-nav .nav-link:focus, .navbar-light .navbar-nav .nav-link:hover{
    color: white;
}

h2.section-title {
    font-family: Arial Narrow Bold;
    font-weight: 700;
    font-style: italic;
    font-size: 45px;
    margin-bottom: 20px;
    color: #000;
}

p.text-center{
    font-size: 18px;
    font-style: italic;
}

.row{
    background-color: black;
    color: white;
}

    </style>
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
                    <a class="nav-link" href="<%=request.getContextPath()%>/update">Update Player Details</a>
                </li>
				
				<li class="nav-item">
                    <a class="nav-link" href="<%=request.getContextPath()%>/delete">Delete Player Details</a>
                </li>
                
                 <li class="nav-item">
                    <a class="nav-link" href="#">Log Out</a>
                 </li>
          </ul>
        </div>
        </div>
    </nav>
    
      <br>
      <br>
      <br><br>
	<table border="2">
	<tr>
	<td>Player Name</td>
	<td>Player Team Name</td>
	<td>Player Number</td>
	<td>player Salary in cr</td>
	<td>Number of Ads</td>
	<td>Number of Matches</td>
	</tr>
	<%ArrayList<Player> playerlist = (ArrayList<Player>)request.getAttribute("playerlist");
    for(Player player:playerlist){%>
    <%-- Arranging data in tabular form
    --%>
    <tr>
            <td><%=player.getPlayer_name()%></td>
            <td><%=player.getPlayer_team_name()%></td>
            <td><%=player.getPlayer_number()%></td>
            <td><%=player.getPlayer_salary_in_cr()%></td>
            <td><%=player.getNumber_of_ads()%></td>
            <td><%=player.getNumber_of_matches()%></td>    
    </tr>           
<%}%>
 </table>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>