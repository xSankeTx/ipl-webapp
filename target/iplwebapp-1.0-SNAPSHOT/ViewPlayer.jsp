<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="model.Player"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IPL 2021</title>
<meta character= "UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="homepagestyle.css">
    <link rel="stylesheet" href="side.css">
    <style>
.heading{

	size: 300px;
	

}

.new-page-img{

    position: relative;
  
    height:500px;
  
    background-size:cover !important;
  
    background-position:center center;
  
    background-repeat: no-repeat;
  
  }
  
  .new-page-img ol.breadcrumb{
  
    background: transparent;
  
  }
  
  .new-page-img ol.breadcrumb li,
  
  .new-page-img ol.breadcrumb li a{
  
    color:#FFF;
  
  }
  
  
  
  .bg-gradient-overlay {
  
    background: rgba(0, 0, 0, 0.6);
  
    background: -webkit-gradient(linear, left top, left bottom, from(rgba(0, 0, 0, 0.8)), color-stop(30%, rgba(0, 0, 0, 0.2)), to(rgba(0, 0, 0, 0)));
  
    background: -webkit-linear-gradient(top, rgba(0, 0, 0, 0.8) 0%, rgba(0, 0, 0, 0.2) 30%, rgba(0, 0, 0, 0) 100%);
  
    background: -o-linear-gradient(top, rgba(0, 0, 0, 0.8) 0%, rgba(0, 0, 0, 0.2) 30%, rgba(0, 0, 0, 0) 100%);
  
    background: linear-gradient(to bottom, rgba(0, 0, 0, 0.8) 0%, rgba(0, 0, 0, 0.2) 30%, rgba(0, 0, 0, 0) 100%);
  
    height:100%;
  
    width:100%;
  
    padding:20px 0px 50px 0px;
  
    content:'';
  
    display:block;
  
  }
  
  
  
  .about-title-section{
  
    padding: 95px 0px 95px 0px;
  
    z-index: 9 !important;
  
  }
  
  
  
  .about-title-section .about-title h1{
  
    color:#FFF;
  
    font-family: 'Playfair Display', serif;
  
    font-size: 35px;
  
  }
  
  
  
  .about-light-section{
  
    border-radius:10px;
  
    padding: 50px 30px;
  
    background: #f0f0f0;
  
    font-family: 'Raleway', sans-serif;
  
    font-size: 14px;
  
    line-height: 2;
  
    color:#666;
  
    font-weight: 500;
  
  }
  
  
  
  .about-padding{
  
    padding: 50px 30px;
  
  }
  
  
  
  .about-line-title{
  
    width: 100%;
  
    margin: 0;
  
    padding: 0;
  
    font-family: 'Raleway', sans-serif;
  
    font-weight: 700;
  
    font-size: 28px;
  
  }
  
  
  
  .about-line-title:after {
  
      position: relative;
  
      top: -6px;
  
      right: -20px;
  
      height: 3px;
  
      content: url(../images/title-right.png);
  
      text-shadow: none;
  
      width: 140px;
  
  }
  
  .about-line-title:before {
  
      position: relative;
  
      top: -6px;
  
      left: -20px;
  
      height: 3px;
  
      content: url(../images/title-left.png);
  
      text-shadow: none;
  
      width: 140px;
  
  }
  
  
  
  .new-about-section{
  
    width: 100%;
  
    padding:50px 0px;
  
    background: #FFF;
  
  }
  
  
  
  .new-details{
  
    position:relative;
  
    width:100%;
  
    background: #fff;
  
    box-shadow:0px 0px 10px rgba(0, 0, 0, .3);
  
    border-radius:10px;
  
    margin-top:-200px;
  
    padding: 50px 30px;
  
  }
  
  
  
  .team {
  
      margin: 50px;
  
  }
  
  
  
  .testimonials-section{
  
      position:relative;
  
      width:100%;
  
      margin: 10px;
  
      background-color:rgba(255, 157, 157, 0.2);
  
      background-repeat:repeat;
  
  }
  
  
  
  #test-carousel .item{width:60%;margin:20px auto;}
  
  #test-carousel .item img{width:100%;}
  
  #test-carousel .item .caption{display:block;margin-top:20px;text-align:center;left:0;}
  
  #test-carousel .item .caption img{max-width:200px;margin:auto;}
  
  #test-carousel .item .caption h4{font-size:16px;font-style:italic;color:#262626;text-shadow:none;margin-top:20px;}
  
  #test-carousel .item .caption h4:before{content:"\f10d";font-family:FontAwesome;margin-right:20px;}
  
  #test-carousel .item .caption h4:after{content:"\f10e";font-family:FontAwesome;margin-left:20px;}
  
  #test-carousel .carousel-control.left,
  
  #test-carousel .carousel-control.right{background:transparent;width:24px;height:24px;top:30%;margin-right:30px;}
  
  #test-carousel .carousel-control.left img,
  
  #test-carousel .carousel-control.right img{width:24px;height:24px;opacity:1;}
  
  
  
  .carousel-section{padding:50px 0px 50px;background:#fff;}
  
  p.text-center{
    font-size: 18px;
    font-style: italic;
  }
  
  .tbclass{
     margin-left: auto;
     margin-right:auto;
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
    <section class="new-page-img" style="background: url(allteam.jpg);background-position:center center;">

    <div class="bg-gradient-overlay">
          
              <div class="container">
          
                <div class="about-title-section">
          
                  <div class="row1">
          
                    <div class="col-sm-12">
          
                      <div class="about-title text-center">
						<br>
						<br>
						<br>
                        <h1 class="heading">View Player Details</h1>
          
                      </div>
          
                    </div>
          
                  </div>
          
                </div>
          
          
          
              </div>
          
          
          
    </div>
    </section>
     
	<section class="new-about-section">
          
            <div class="container">
          
              <div class="row1">
          
                <div class="col-md-12">
          
                  <div class="new-details no-padding">
          
                    <div class="row1">
          
                      <div class="col-md-12">
          
                        <div class="view_Player_Details text-center">
          
                         <table class="tbclass" border="2">
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
          
                        </div>
          
                      </div>
          
                    </div>
          
                   </div>
          
                  </div>
          
                </div>
          
              </div>
          
            </div>
          
          </div>
          
	</section>
</body>
</html>