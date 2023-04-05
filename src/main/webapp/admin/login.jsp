<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/style.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/skin_/login.css" />
    <script type="text/javascript" src="<%=basePath%>admin/statics/js/jquery.js"></script>
    <script type="text/javascript" src="<%=basePath%>admin/statics/js/jquery.select.js"></script>
    <title>系统用户登录</title>
</head>
<%
    String message = (String)request.getAttribute("message");
    if(message == null){
        message = "";
    }
    if (!message.trim().equals("")){
        out.println("<script language='javascript'>");
        out.println("alert('"+message+"');");
        out.println("</script>");
    }
    request.removeAttribute("message");
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <form name="form1" method="post" action="<%=basePath%>admin/adminLogin">
            <div class="login-box">
                <div id="logo"></div>
                <h1></h1>
                <div class="input username" id="username">
                    <label for="userName">用户账户</label>
                    <span></span>
                    <input type="text" name="username" autocomplete="off"  required=""/>
                </div>
                <div class="input psw" id="psw">
                    <label for="password">登录密码</label>
                    <span></span>
                    <input type="password" name="password" autocomplete="off"  required=""/>
                </div>
               
                <div class="styleArea">
                    <div class="styleWrap">
                        <select name="sf">
                            <option value="普通管理">普通管理</option>
                            <option value="管理员">管理员</option>
                        </select>
                    </div>
                </div>
                <div id="btn" class="loginButton">
                    <input type="submit" class="button" value="登录"  />
                </div>
            </div>
            </form>
        </div>
    </div>

</div>

</body>
<script type="text/javascript">
    var height = $(window).height() > 445 ? $(window).height() : 445;
    $("#container").height(height);
    var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
    $('#bd').css('padding-top', bdheight);
    $(window).resize(function(e) {
        var height = $(window).height() > 445 ? $(window).height() : 445;
        $("#container").height(height);
        var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
        $('#bd').css('padding-top', bdheight);
    });
    $('select').select();

    // $('.loginButton').click(function(e) {
    //     document.location.href = "index.html";
    // });
</script>

</html>
