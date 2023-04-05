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

    String username=(String)session.getAttribute("user");
    if(username==null){
        response.sendRedirect(path+"index.jsp");
    }
    else{
        String method=request.getParameter("method");
        String id="";
        String mc="";
        if(method.equals("upfl")){
            id=request.getParameter("id");
            List alist=cb.get1Com("select * from fl where id='"+id+"'",2);
            mc=alist.get(1).toString();
        }
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form action="<%=basePath%>fl/addFl" method="post">
                <input type="hidden" name="method" value="<%=method%>" /><input type="hidden" name="id" value="<%=id%>" />
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label>分类名称</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="mc" value="<%=mc %>" required/>
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