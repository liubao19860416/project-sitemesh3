<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8" />
<meta name="description" content="CookBook Application" />
<title>Sitemesh3全局页面1 <sitemesh:write property='title'/></title>

<script>
	function draw() {
		var canvas = document.getElementById("b");
		if (canvas.getContext) {
			var ctx = canvas.getContext("2d");

			ctx.fillStyle = "rgb(200,0,0)";
			ctx.fillRect(10, 10, 55, 50);

			ctx.fillStyle = "rgba(0, 0, 200, 0.5)";
			ctx.fillRect(30, 30, 55, 50);
		}
	}
</script>

<style>
#css3 div>div {
	margin: 0px 0px 50px 0px;
	padding: 6px;
	border: 1px solid #eee;
}

#grid div {
	text-align: center;
}

#grid div>.col {
	border-bottom: 1px solid #ccc;
	padding: 10px 0px;
	outline: 1px solid #eee;
}

h2 {
	border-bottom: 1px dashed #ccc;
}

.documentation {
	display: block;
	background-color: #eee;
	padding: 6px 13px;
	font-family: Georgia, "Times New Roman", Times, serif;
	color: #666;
	text-align: right;
	text-shadow: -1px -1px 0px #fff;
}

footer {
	text-align: center;
	color: #666;
	font-size: 0.9em;
	padding: 4px 0px;
}
</style>

<sitemesh:write property='head'/>
</head>
<body id="body-wrap">
	<header id="header-wrap">
		<div class="row">
			<div class="logo col_12 col">CookDB</div>
			<nav class="col_4 col">
				<ul>
					<li><a href="javascript:void(0)">Login</a>
					</li>
					<li><a href="javascript:void(0)">Sign up</a>
					</li>
				</ul>
			</nav>
		</div>
		<div class="clear"></div>
	</header>
	
	<sitemesh:write property='body'/>
	
	<footer class="row">
		<div class="col_16 col">
			all rights reserved &copy; <a href="javascript:void(0)">cookdb inc</a> | Recipe search ends here
		</div>
	</footer>
</body>
</html>