<%--
  Created by IntelliJ IDEA.
  User: lexa
  Date: 20.05.16
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
	<head>
  		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <link rel="icon" href="./favicon.ico" type="image/x-icon">
			<title>Точка связи</title>
  				<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"/>
  				<link href="./css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
 				 <link href="./css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
	</head>
	<body>
		<div class="navbar-wrapper">
  			<nav>
    			<ul id="dropdown1" class="dropdown-content blue darken-4 white-text" >
      				<li><a class="white-text" href="./CDMA">CDMA телефоны</a></li>
     				<li><a class="white-text"  href="./GSM">GSM телефоны</a></li>
     				<li><a class="white-text"  href="./CDMA_GSM">Двухстандартные телефоны </a></li>
    				<li><a class="white-text"  href="./MODEM">USB модемы</a></li>
     				<li><a class="white-text"  href="./Mi_fi">Mi-Fi роутеры</a></li>
     				<li class="divider"></li>
    				<li><a class="white-text"  href="./ETC">Прочее</a></li>
   				</ul>
		    	<div class="nav-wrapper blue darken-4">
		    		<a href="#!"><img class="responsive-img" src="images/logo.png"/></a>
						<ul class="right hide-on-med-and-down">
					        <li>
          						<form>
          							<div class="input-field">
            							<input id="search" type="search" required>
           									 <label for="search"><i class="material-icons">search</i></label>
           										 <i class="material-icons">close</i>
        							 </div>
       							 </form>
       						</li>
       						<li><a class="dropdown-button active" href="#" data-activates="dropdown1">Каталог товаров<i class="material-icons right">arrow_drop_down</i></a></li>
    					</ul>
   					</div>
  				</nav>
  		</div>
  		
	<div class="container">
		<div class="row">
		<%@ page import="database.DBManager"%>
		<%@ page import="ViewUtils.ItemViewGenerator" %>
		<%@ page import="model.Model" %>

<%
	
	for(Model item : DBManager.getInstance().getAllItems()){
		for(int i=0;i<20;i++)out.print(ItemViewGenerator.generateView(item));
	}
	%>

	</div>
 	</div>



<footer class="page-footer blue darken-4">
  <div class="container">
    <div class="row">
      <div class="col l6 s12">
        <h5 class="white-text">Контакты</h5>
        <p class="grey-text text-lighten-4">+38 (098) 947 69 10</p>
      </div>
      <div class="col l4 offset-l2 s12">
        <h5 class="white-text">Мы в социальных сетях</h5>
        <ul>
          <li><a class="grey-text text-lighten-3" href="#!">В контакте</a></li>
          <li><a class="grey-text text-lighten-3" href="#!">Twitter</a></li>
          <li><a class="grey-text text-lighten-3" href="#!">Facebook</a></li>
          <li><a class="grey-text text-lighten-3" href="#!">Одноклассники</a></li>
        </ul>
      </div>
    </div>
  </div>
  <div class="footer-copyright">
    <div class="container">
      © 2015 Точка Связи
      <a class="grey-text text-lighten-4 right" href="#!"></a>
    </div>
  </div>
</footer>


<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="./js/materialize.js"></script>
<script src="./js/init.js"></script>
<script src="./js/dropdown.js"></script>
</body>
</html>


