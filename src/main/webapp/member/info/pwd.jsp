<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="cb" scope="page" class="com.bean.ComBean" />
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>member/statics/css/style.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>member/statics/css/skin_/form.css" />
    <script type="text/javascript" src="<%=basePath%>member/statics/js/jquery.js"></script>
</head>
<script type="text/javascript">
    function checkPasswords() {
        var pass1 = document.getElementById("newpwd");
        var pass2 = document.getElementById("repwd");

        if (pass2.value != pass1.value)
            pass2.setCustomValidity("两次输入的密码不匹配");
        else
            pass2.setCustomValidity("");
    }
</script>
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

    String member=(String)session.getAttribute("member");
    if(member==null){
        response.sendRedirect(path+"login.jsp");
    }
    else{
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form action="<%=basePath%>member/memberupPwd" method="post">
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label>旧密码</label>
                        <div class="kv-item-content">
                            <input type="password" style="width:400px; height:30px;" name="oldpwd" id="oldpwd" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>新密码</label>
                        <div class="kv-item-content">
                            <input type="password" style="width:400px; height:30px;" name="newpwd" id="newpwd" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>确认密码</label>
                        <div class="kv-item-content">
                            <input type="password" style="width:400px; height:30px;" name="repwd" id="repwd" onchange="checkPasswords()" required/>
                        </div>
                    </div>
                    <div class="buttons">
                        <input class="button" type="submit" value="确定提交" />
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
<%} %>