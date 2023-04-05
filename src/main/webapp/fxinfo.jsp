<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="iframe/head.jsp" %>
<%
    String id=request.getParameter("id"); if(id==null)id=(String)request.getAttribute("id");
    List xwlist =cb.get1Com("select * from fx where id='"+id+"'",7);
%>
<!--信息内容样式-->
<div class="Inside_pages clearfix">
    <div class="right_style">
        <div class="title_style"><center><%=xwlist.get(1).toString()%></center></div>
        <div class="content_style">
            <div class="Bulletin_style">
                <div class="Bulletin_list">
                    <ul class="list">
                        <li class="Bulletin_content">
                            <center>信息来源：<%=xwlist.get(2).toString()%> 发布用户：<%=xwlist.get(5).toString()%> 发布时间：<%=xwlist.get(6).toString()%>
                                <a href="<%=basePath%>fxsc/addMethod?fxid=<%=id%>">收藏</a></center> </br>
                            <p align="center"><img src="<%=basePath+xwlist.get(3).toString()%>" width="500"></p>
                            <p><%=xwlist.get(4).toString()%></p>
                            </br>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="Inside_pages clearfix">
    <div class="right_style">
        <div class="title_style"><em></em>评论</div>
        <table width="100%" border="0">
            <%
                List pjlist=cb.getCom("select * from pl where fxid='"+id+"' order by id desc",6);
                if(!pjlist.isEmpty()){
                    for(int i=0;i<pjlist.size();i++){
                        List list2=(List)pjlist.get(i);
            %>
            <tr>
                <td>评论内容：<%=list2.get(3).toString()%> &nbsp;&nbsp;
                    评论用户：<%=list2.get(4).toString()%>
                    评论时间：<%=list2.get(5).toString()%><br />
                    <br />
                </td>
            </tr>
            <%}}%>
        </table>
    </div>
</div>

<%if(member!=null){%>
<div class="Inside_pages clearfix">
    <div class="right_style">
        <div class="title_style"><em></em>评论</div>
        <form action="<%=basePath%>pl/addMethod?fxid=<%=id%>" method="post" name="">
            <div class="content_style">
                <ul class="add_shops_style">
                    <li><label>内容：</label><div class="add_right_style">
                        <textarea name="nr" class="textarea" required="required"></textarea></div></li>
                </ul>
                <div class="submit_style"><input type="submit" value="确定提交"  class="submit_btn"/></div>
            </div>
        </form>
    </div>
</div>
<%}else{%>
<p align="center">登录后可以评论！</p></br></br>
<%}%>
<!--信息内容样式END-->
<%@ include file="iframe/foot.jsp" %>
