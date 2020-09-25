<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file = "header.jsp" %>
<%--LOGIN form--%>
<div class="loginbox">
    <h1>SIGNIN PANNEL</h1>
    <form method="POST" action="ServletOne">
      <p><i class="fa fa-user" aria-hidden="true"></i> user email</p>
      <input type="text" name="username" placeholder="Enter Email" autocomplete="off" id="username">
      <p><i class="fa fa-key" aria-hidden="true"></i> password</p>
      <input type="password" name="password" placeholder="Enter Password" autocomplete="off" id="password">
      <button type="submit" name="loginbtn">LOGIN</button>
    </form>
  </div>
<%@ include file = "footer.jsp" %>