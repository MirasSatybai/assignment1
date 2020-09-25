<%--
  Created by IntelliJ IDEA.
  User: Мирас
  Date: 13.09.2020
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    int pageCount = 0;
    void Count() {
        pageCount++;
    }
%>

<% Count(); %>

<html>
<head>
    <title>This page visited <%= pageCount %> times.</title>
    <link rel="stylesheet" href="master.css">
</head>
<body>
    <% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>
    <center>
        <h2>Login</h2>
    </center>

