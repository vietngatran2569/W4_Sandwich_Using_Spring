<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vietngatran
  Date: 11/11/2019
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form method="post" action="showSandwich">
      <fieldset style="height: fit-content; width: fit-content">
          <legend>Sandwich Condiments Selection</legend>
          <form:checkboxes path="condiment"  items="${condiment}" name="condiment"/>
          <p><button type="submit">Order</button></p>
      </fieldset>
  </form>
  <p>Orders: ${result}</p>
  </body>
</html>
