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
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="includes/css/bootstrap-glyphicons.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="includes/css/styles.css" rel="stylesheet">
<!-- Include Modernizr in the head, before any other Javascript -->
<script src="includes/js/modernizr-2.6.2.min.js"></script>
<script src="includes/js/script.js"></script>
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
				<form class="navbar-form pull-right">
					<input type="text" class="form-control" placeholder="Search it here..." id="searchInput">
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
				<div class="item" id="slide2">
					<div class="carousel-caption">
						 <h4>amazon</h4>
                 		 <p> Amazon.com to offer customers more types of products, more conveniently and at lower prices</P>
					</div>
				</div>
				<!--end slide2-->
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

			<!-- table -->
		<div class="bs-example">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Product</th>
						<th>longDescription</th>
						<th>SKU</th>
						<th>Base Price</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products}" var="product">
						<tr>
							<td><c:out value="${product.name}" /></td>
							<td><c:out value="${product.longDescription}" /></td>
							<td><c:out value="${product.sku}" /></td>
							<td><c:out value="${product.regularPrice}" /></td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
	

			<div>
				<p>
				<p>
			</div>

		</div>
		<!--end container-->
		
		<div class="row" id="bigCallout">
			<div class="col-12">
				<div class="well">
					<div class="page-header">
						<h3>
							About wheretobuy <small>.com</small>
						</h3>
					</div>
					<!-- end page-header -->

					<p class="lead">wheretobuy.com is the industry innovator in
						online shopping. Smart shoppers can instantly find and compare
						millions of unique products and services across over 26
						categories, such as Clothing, Babies & Kids, Electronics,
						Computers, TV's, Furniture, Fashion, Cameras and more. The website
						also offers shoppers the ability to view and compare over
						thousands of merchants and their respective pricing information
						for products and services, thereby enabling users to ultimately
						find the right product from the right merchant at the best price.
						wheretobuy commerce solutions connect online shoppers to merchants
						of all sizes and scope, from large traditional merchants, such as
						Best Buy, Ebay to smaller local merchants with unique products.</p>

					<a href="" class="btn btn-primary">Click for more information</a>
				</div>
				<!-- end well -->

			</div>
			<!-- end col-12 -->
		</div>
		<!-- end bigCallout -->
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
						id="imgspace" src="images/EBay_logo.svg.png" width="100"
						height="90" alt="ebay" hspace="100" /> <img id="imgspace"
						src="${context}/resources/images/Amazon_com.png" width="100" height="90" alt="amazon" />
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
	<script src="bootstrap/js/bootstrap.min.js"></script>
	<!-- Custom JS -->
	<script src="includes/js/script.js"></script>
</body>
</html>