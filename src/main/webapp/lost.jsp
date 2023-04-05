<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="iframe/head.jsp" %>
<!--输入样式-->
<div class="Inside_pages clearfix">
    <div class="right_style">
        <div class="title_style"><em></em>忘记密码</div>
        <form action="<%=basePath%>member/toLost" method="post" name="">
            <div class="content_style">
                <ul class="add_shops_style">
                    <li><label>用户账号：</label><div class="add_right_style">
                        <input name="username" type="text"  class="text_name" required="required"/></div></li>
                    <li><label>密保邮箱：</label><div class="add_right_style">
                        <input name="email" type="email"  class="text_name" required="required"/></div></li>
                </ul>
                <div class="submit_style"><input type="submit" value="确定提交"  class="submit_btn"/></div>
            </div>
        </form>
    </div>
</div>
<!--输入样式END-->
<%@ include file="iframe/foot.jsp" %>