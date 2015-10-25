<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8" />
<meta name="description" content="CookBook Application" />
<title>Sitemesh3全局页面2 <sitemesh:write property='title'/></title>

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