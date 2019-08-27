<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/27/2019
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body>
  <div id="content">
    <h1>Product Discount Calculator</h1>
    <form method="post" action="${pageContext.request.contextPath}/display">
      <div id="data">
        <label>Product Description: </label>
        <input type="text" name="description">
        <br>
        <label>List Price:</label>
        <input type="text" name="price">
        <br>
        <label>Discount Percent:</label>
        <input type="text" name="Percent">
        "%"
        <br>
      </div>
      <div id="buttons">
        <label>&nbsp;</label>
        <input type="submit" value="Calculate Discount">
      </div>
    </form>

  </div>
  </body>
</html>
