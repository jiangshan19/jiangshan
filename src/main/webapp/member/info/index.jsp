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
        String realname="";String sex="";String sfz="";String tel="";String email="";
        List alist=cb.get1Com("select * from member where username='"+member+"'",9);
        realname=alist.get(3).toString();
        sex=alist.get(4).toString();
        sfz=alist.get(5).toString();
        tel=alist.get(6).toString();
        email=alist.get(7).toString();
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form action="<%=basePath%>member/upMember" method="post">
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label>姓名</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="realname" value="<%=realname %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>身份</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="sex" value="<%=sex %>" readonly/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>身份证号</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="sfz" value="<%=sfz %>" pattern="[0-9]{18}" title="18位号码" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>联系电话</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="tel" value="<%=tel %>" pattern="[0-9]{11}" title="11位手机号码" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>密保邮箱</label>
                        <div class="kv-item-content">
                            <input type="email" style="width:420px; height:30px;" name="email" value="<%=email %>" required/>
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