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
        String imgUrl=cb.getString("select tx from member where username='"+member+"'");
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form name="form1" class="layui-form" action="<%=basePath%>upload/uploadfiles" method="post" enctype="multipart/form-data">
                <div class="subfild-content base-info"><input type="hidden" name="method" value="uptx" />
                    <div class="kv-item ue-clear">
                        <label>当前头像</label>
                        <div class="kv-item-content">
                            <img src="<%=basePath+imgUrl%>" width="200" height="250" border="0" />
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>jpg格式图片</label>
                        <div class="kv-item-content">
                            <input type="file" style="width:400px; height:30px;" name="file" id="file" required/>
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