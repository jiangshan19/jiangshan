<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="iframe/head.jsp" %>
<!--输入样式-->
<div class="Inside_pages clearfix">
    <div class="right_style">
        <div class="title_style"><em></em>复合查询</div>
        <form action="<%=basePath%>sinfo2.jsp" method="post" name="">
            <div class="content_style">
                <ul class="add_shops_style">
                    <li><label>分类：</label>
                        <div class="add_right_style">
                            <select name="fl" class="select" required>
                            <option value="">请选择</option>
                            <%List flist=cb.getCom("select * from fl order by id asc",2);if(!flist.isEmpty()){for(int i=0;i<flist.size();i++){List list2=(List)flist.get(i);%>
                            <option value=<%=list2.get(1).toString() %>><%=list2.get(1).toString() %></option>
                            <%}} %>
                        </select></div>
                    </li>
                    <li><label>名称：</label>
                        <div class="add_right_style"><input name="mc" class="text_name" required="required"/></div>
                    </li>
                </ul>
                <div class="submit_style"><input type="submit" value="确定提交"  class="submit_btn"/></div>
            </div>
        </form>
    </div>
</div>
<!--输入样式END-->
<%@ include file="iframe/foot.jsp" %>