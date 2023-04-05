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
        response.sendRedirect(path+"index.jsp");
    }
    else{
        String gwcid=request.getParameter("gwcid");
        String ddbh=request.getParameter("ddbh");
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form action="<%=basePath%>gwdd/upPfpj" method="post">
                <input type="hidden" name="gwcid" value="<%=gwcid%>" /><input type="hidden" name="ddbh" value="<%=ddbh%>" />
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label>评分</label>
                        <div class="kv-item-content">
                            <select name="pf" style="height:30px; line-height:30px;width: 300px">
                                <option value="5">5</option>
                                <option value="4">4</option>
                                <option value="3">3</option>
                                <option value="2">2</option>
                                <option value="1">1</option>
                            </select>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>评价</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="pj" required/>
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