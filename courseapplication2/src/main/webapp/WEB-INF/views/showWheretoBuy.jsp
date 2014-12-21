<%@ include file="./include.jsp"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<title>wheretobuy.com</title>
<meta name="description" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<!-- Bootstrap CSS -->
<link href="${context}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${context}/resources/includes/css/bootstrap-glyphicons.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="${context}/resources/includes/css/styles.css" rel="stylesheet">
<!-- Include Modernizr in the head, before any other Javascript -->
<script src="${context}/resources/includes/js/modernizr-2.6.2.min.js"></script>
<script src="${context}/resources/includes/js/script.js"></script>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<div class="container" id="main">
		<div class="container">
			<a class="navbar-brand" href="/"><img src="${context}/resources/images/logo2.png" alt="your logo"></a>
			<button class="navbar-toggle" data-target=".navbar-responsive-collapse" data-toggle="collapse" type="button">
				<span class="icon-bar"></span> <span class="icon-bar"></span> 
				<span class="icon-bar"></span>
			</button>
			<div class=" nav-collapse collapse navbar-responsive-collapse">
				<form class="navbar-form pull-right" method="POST" commandName="product" action="search/name">
					<input type="text" class="form-control" placeholder="Search it here..." id="searchInput" name="name" path="name">
					<button type="submit" id="searchIcon" class="btn btn-default">
						<span class="glyphicon glyphicon-search"></span>
					</button>
				</form>
				<!-- end navbar-form-->
			</div>
		</div>
		<!--end container-->
		<div class="carousel slide" id="mycarousel">
			<ol class="carousel-indicators">
				<li class="active" data-slide-to="0" data-target="#mycarousel"></li>
				<li data-slide-to="1" data-target="#mycarousel"></li>
				<li data-slide-to="2" data-target="#mycarousel"></li>
				<li data-slide-to="3" data-target="#mycarousel"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item active" id="slide1">
					<div class="carousel-caption">
						 <h4>wheretobuy</h4>
                 		 <p>wheretobuy is use to filter and compare products based on price, features, and other criteria</p>
					</div>
				</div>
				<!--end slide1-->
				
				<div class="item" id="slide3">
					<div class="carousel-caption">
						<h4>ebay </h4>
                 		 <p>eBay offers an online platform where millions of items are traded each day</p>
					</div>
				</div>
				<!--end slide3-->
				<div class="item" id="slide4">
					<div class="carousel-caption">
						<h4>bestbuy </h4>
                 		 <p>Best Buy offers tablets and computers, televisions, mobile phones, large and small appliances, entertainment products, digital imaging and related accessories. </p>
					</div>
				</div>
				<!--end slide4-->
			</div>
			<!--carousel-inner-->
			<!--controls-->
			<a class="left carousel-control" data-slide="prev" href="#mycarousel"><span
				class="icon-prev"></span></a> <a class="right carousel-control"
				data-slide="next" href="#mycarousel"><span class="icon-next"></span></a>
		</div>

		<p>
		<p>

		
		<!--end container-->
		
				<div>
			<p>wheretobuy innovative shopping offerings make it a valuable
				ally for any consumer; they include: BottomLinePrice calculations
				(tax and shipping included in price), merchant ratings and reviews,
				detailed product information and reviews, side-by-side product
				comparisons and email notifications with the best prices and
				availability on the Internet.
			<p>

			
				<marquee behavior="scroll" direction="left">
					<img id="imgspace" src="${context}/resources/images/bestbuyMove.png" width="100"
						height="90" alt="bestbuy" /> &nbsp; &nbsp; &nbsp; &nbsp; <img
						id="imgspace" src="${context}/resources/images/EBay_logo.svg.png" width="100"
						height="90" alt="ebay" hspace="100" /> 
				</marquee>

				&nbsp;
		</div>

	</div> <!-- end main container -->

	<footer>
	<div class="container">
		<div class="col-sm-4">
			<h6>Copyright &copy; 2014</h6>
		</div>
		<!-- end col-sm-4-->
		<div class="col-sm-4">
			<H4>Contact Us</H4>
			<ul class="unstyled">
				<li><a href="#">Facebook</a></li>
				<li><a href="#">Twitter</a></li>
				<li><a href="#">Google plus</a></li>
			</ul>
		</div>
		<!-- end col-sm-4-->
		<div class="col-sm-4">
			<H4>Follow us</H4>
			<ul class="unstyled">
				<li><a href="#">Facebook</a></li>
				<li><a href="#">Twitter</a></li>
				<li><a href="#">Google plus</a></li>
			</ul>
		</div>
		<!-- end col-sm-4-->
	</div>
	<!-- end container--> </footer>


	<!-- All Javascript at the bottom of the page for faster page loading -->
	<!-- First try for the online version of jQuery-->
	<script src="http://code.jquery.com/jquery.js"></script>
	<!-- If no online access, fallback to our hardcoded version of jQuery -->
	<script>
		window.jQuery
				|| document
						.write('<script src="includes/js/jquery-1.8.2.min.js"><\/script>')
	</script>
	<!-- Bootstrap JS -->
	<script src="${context}/resources/bootstrap/js/bootstrap.min.js"></script>
	<!-- Custom JS -->
	<script src="${context}/resources/includes/js/script.js"></script>
</body>
</html>