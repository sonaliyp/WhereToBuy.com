<%@ include file="./include.jsp"%>
<%@ page session="false" %>
<c:set var="context" scope="request" value="<%= request.getContextPath()%>" />
<html>
<head>
<style>
body{
          
               
                background-color: lightyellow;
                //border: 3px dotted black;
                margin: 10px;
                padding-bottom: 20px;
                width:50%;
                margin:auto;
            }
            section {
                background-color: white;
                //border: 2px solid black;
                width: 700px;
                margin: 20px; /* all four sides */
                padding: 10px; /* all four sides */
            }
            h1,p{
                //background-color: white; 
                //border: 1px dashed black;
                padding: 10px;
            }
            h1 ,p{

                margin: .0em 0 0em; /* .5em top, 0 right and left, .25em bottom */
                padding-left: 15px;
            }
            p {

                margin: 0; /* all four sides */
                padding-left: 15px;
            }
</style>
	<title>Home page</title>
	<link rel="stylesheet" type="text/css" href="../resources/css/nav.css" />
</head>
<body>
<section>

<%@ include file="./homeNavbar.jsp"%>

<center>
<h1>Welcome </h1>
	
<br>
<br>
<br>
<h4 style="background-color:White; text-align:center;color:#3B5998; font-family: Times New Roman;font-size:9;">2014  Inc.</h4>
</section>
</center>
</div>
</body>
</html>
