<html>
<head>
<title>:: Online SuperShopping ::</title>
<style>
 body {
    background:skyblue;
    margin:0;
 }
 .menu{
       width:100%;
       background:#142b47;
       overflow:auto;
}
.menu ul{
        margin:0;
		padding:0;
		list-style:none;
		line-height:60px;
}	   
.menu li{
		float:right;
}
.menu ul li a{
		background:#142b47;
		text-decoration:none;
		width:130px;
		display:block;
		text-align:center;
		color:#f2f2f2;
		font-size:18px;
		font-family:sans-serif;
		letter-spacing:0.5px;
}
.menu li a:hover{
		color:#fff;
		opacity:0.5;
		font-size:19px;
}
.name{
	  float:center;
	  width:200px;
      color:#174042;
	  font-family:fantasy;

}

.search-form{
		

		width: 45%;
		text-align:center;
		margin-top:0;
		float:left;
		margin-center:100px;
}
input[type=text]{
		padding:7px;
		border:none;
		font-size:16px;
		font-family:sans-serif;
}
button {
		
		float:center;
		background:orange;
		color:white;
		border-radius:0 10px 10px 0;
		cursor:pointer;
		position:relative;
		padding:7px;
		font-family:sans-serif;
		border:none;
		font-size:16px;
		
}		


</style>

</head>
<body>
<nav class = "menu">
  <ul>
    <li><a href = "#">About</a></li>
    <li><a href = "#">Login</a></li>
    <li><a href = "#">Contact</a></li>
  </ul>

</nav>
<h1 class= "name">
      Super Shop</h1>
<form class = "search-form" action= "./catName" method="POST">
<input type="text" value="" name="catName" id="catName" />

<button> Search</button>
</form>
</body>
</html>
