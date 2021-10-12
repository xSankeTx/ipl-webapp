<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="model.Player"%>
    <%@page import="java.util.ArrayList"%>
<html>
<body>
<h2>Hello World!</h2>
<a href="<%=request.getContextPath()%>/view">Get all players</a>
<%ArrayList<Player> playerlist = (ArrayList<Player>)request.getAttribute("playerlist");
    for(Player player:playerlist){%>
    <%-- Arranging data in tabular form
    --%>
       <ul>
            <li><%=player.getPlayer_name()%></li>
            <li><%=player.getPlayer_team_name()%></li>
            <li><%=player.getPlayer_number()%></li>
            <li><%=player.getPlayer_salary_in_cr()%></li>
            <li><%=player.getNumber_of_ads()%></li>
            <li><%=player.getNumber_of_matches()%></li>                  
        </ul>
<%}%>
</body>
</html>
