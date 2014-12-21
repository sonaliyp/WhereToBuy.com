<%@ include file="./include.jsp"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <c:set var="context" scope="request" value="<%= request.getContextPath()%>" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>
     
        </title>
                <style>
                   body {
             
          background-color: lightyellow;
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
                
    body{
                background-image: url("../images/seamless-background-simply-sky.jpg");
                

LEGEND { position: relative; width: 50 }
            
            p
{
background-color:yellow;
}
p.padding
{
padding-top:25px;
padding-bottom:25px;
padding-right:5px;
padding-left:50px;
}
            }
            section {
                background-color: white;
                //border: 2px solid black;
                width: 700px;
                margin: 20px; /* all four sides */
                padding: 10px; /* all four sides */
            }
           .error {
		    font-size: 0.8em;
			color: #ff0000;
		}
</style>
    </head>
    <body>
    <h3 style=" text-align:center;color:blue; font-family: Times New Roman;">It's easy to learn about our club.Simply complete this form and we will get in touch!</h3>
         <form:form method="POST" action="./product" commandName="product">
      
            <fieldset ><section>
            <legend> Fill the form </legend>
               
             
       <table>

<a href="${context}/home"><h4> Home</h4></a>
  	<tr>
  	<td><form:label path="name">Equipment ID</form:label></td>
        <td><form:input path="name" />
            <form:errors path="name" cssClass="error"/>
        </td>
    </tr>
    <tr>
  	<td><fmt:message key="equipmentNameLabel" /></td>
        <td><form:input path="longDescription" />
            <form:errors path="longDescription" cssClass="error"/>
        </td>
    </tr>
    <tr>
  	<td><fmt:message key="equipmentDetailsLabel" /></td>
        <td><form:input path="sku" />
            <form:errors path="sku" cssClass="error"/>
        </td>
    </tr>   
    <td><input type="submit" value="<fmt:message key="enterBtn1" />"> </td>
    </tr>
    </table>
       
        
        
    <td><input type="submit" value="<fmt:message key="enterBtn1" />"> </td>
      <a href="${context}/home"><h3> Home</h3></a>
   
      
<br><br><br>
       </section>
   </fieldset>    
     
 </form:form>
 
    </body>
</html>

