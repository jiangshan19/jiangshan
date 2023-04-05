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
        String usernam="";String password="";String realname="";String sex="";String age="";String address="";String tel="";
        List alist=cb.get1Com("select * from admin where username='"+username+"'",9);
        realname=alist.get(3).toString();
        sex=alist.get(4).toString();
        age=alist.get(5).toString();
        tel=alist.get(6).toString();
        address=alist.get(7).toString();
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form action="<%=basePath%>admin/adminupdateByUsername" method="post">
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label>真实姓名</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="realname" value="<%=realname %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>性别</label>
                        <div class="kv-item-content">
                    	<span class="choose">
                            <span class="checkboxouter">
                                <input type="radio" name="sex" checked="checked"/>
                                <span class="radio"></span>
                            </span>
                            <span class="text">男</span>
                        </span>
                            <span class="choose">
                            <span class="checkboxouter">
                                <input type="radio" name="sex" />
                                <span class="radio"></span>
                            </span>
                            <span class="text">女</span>
                        </span>

                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>年龄</label>
                        <div class="kv-item-content">
                            <input type="number" min="18" max="100" style="width:200px; height:30px;" name="age" value="<%=age %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>联系电话</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="tel" value="<%=tel %>" pattern="[0-9]{11}" title="11位手机号码" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>地址</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="address" value="<%=address %>" required/>
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