<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="iframe/head.jsp" %>
<%
    String id=request.getParameter("id");
List xwlist =cb.get1Com("select * from xw where id='"+id+"'",5);
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
                            <center>来源：<%=xwlist.get(2).toString()%> 时间：<%=xwlist.get(4).toString()%></center> </br>
                            <p><%=xwlist.get(3).toString()%></p>
                            </br>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!--信息内容样式END-->
<%@ include file="iframe/foot.jsp" %>