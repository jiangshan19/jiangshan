<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="iframe/head.jsp" %>
<!--输入样式-->
<div class="Inside_pages clearfix">
    <div class="right_style">
        <div class="title_style"><em></em>登录</div>
        <form action="<%=basePath%>member/toLogin" method="post" name="">
            <div class="content_style">
                <ul class="add_shops_style">
                    <li><label>用户账号：</label><div class="add_right_style">
                        <input name="username" type="text"  class="text_name" required="required"/></div></li>
                    <li><label>登录密码：</label><div class="add_right_style">
                        <input name="password" type="password"  class="text_name" required="required"/></div></li>
                    <li><label>用户身份：</label><div class="add_right_style">
                        <input type="radio" class="loginuser3" name="sex" value="用户" checked/> <font size=3px;>用户</font>
                        <input type="radio" class="loginuser3" name="sex" value="基地"/> <font size=3px;>基地</font></div></li>

                </ul>
                <div class="submit_style"><input type="submit" value="确定提交"  class="submit_btn"/>
                    <a href="<%=basePath%>lost.jsp">忘记密码？</a></div>
            </div>
        </form>
    </div>
</div>
<!--输入样式END-->
<%@ include file="iframe/foot.jsp" %>
