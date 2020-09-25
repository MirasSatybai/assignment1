<%--
  Created by IntelliJ IDEA.
  User: Мирас
  Date: 13.09.2020
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="master.css">
    <script src="<%=request.getContextPath()%>/js/jqueryUI-AutoComplete/jquery-1.9.1.js"></script>
    <script>
        $(window).on('load', function(){
            $('.left').animate({left: '-50%'},"slow")
            $('.right').animate({right: '-50%'},"slow")
        })
    </script>
</head>
<body>
<div class="left"></div>
<div class="right"></div>
<div class="videoint">
    <div class="video">
        <video class="media" src="video/welcome.mp4" autoplay muted></video>
    </div>
    <button type="submit" name="button1" >Start</button><br>
</div>
</body>

</html>
