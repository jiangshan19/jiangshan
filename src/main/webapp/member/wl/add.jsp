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
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/style.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/skin_/form.css" />
    <script type="text/javascript" src="<%=basePath%>admin/statics/js/jquery.js"></script>
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
        response.sendRedirect(path+"index.jsp");
    }
    else{
        String id=request.getParameter("id");
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form action="<%=basePath%>wl/upMethod" method="post">
                <input type="hidden" name="id" value="<%=id%>" />
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label>回复内容</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="hf" required/>
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
