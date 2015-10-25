<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<link rel="stylesheet" type="text/css" href="<c:url value="/resources/52/css/reset.css"/>" media="screen"
	title="html5doctor.com Reset Stylesheet" />

<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/52/css/css3.css"/>" media="screen" />

<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/52/css/grid.css"/>" media="screen" />

<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/cookdb.css"/>" media="screen" />

<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/jquery-ui/custom-theme/jquery-ui-1.8.10.custom.css"/>"
	media="all" />

<script src="<c:url value="/resources/52/js/modernizr-1.7.min.js"/>"></script>

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

