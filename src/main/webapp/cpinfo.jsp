<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="iframe/head.jsp" %>
<link href="<%=basePath%>statics/css/css.css" rel="stylesheet" type="text/css" />
<%
    String id=request.getParameter("id"); if(id==null)id=(String)request.getAttribute("id");
    List list=cb.get1Com("select * from cp where id='"+id+"'",16);
    cb.comUp("update cp set dj=dj+1 where id='"+id+"'");
%>
<!--中部内容-->
<div class="clear">&nbsp;</div>
<div class="sup-wid">
    <div class="pro_detail" >
        <div class="pro_detail_img float-lt">
            <div class="gallery">
                <div class="tb-booth tb-pic tb-s310"><img src="<%=basePath+list.get(6).toString()%>" class="jqzoom" /></div>
            </div>
        </div>
        <div class="float-lt pro_detail_con">
            <div class="pro_detail_tit"><%=list.get(1).toString() %></div>
            <div class="clear"></div>
            <div class="pro_detail_price  margin-t20"><span class="margin-r20">分类：<%=list.get(2).toString() %></span></div>
            <div class="clear"></div>
            <div class="yushou">
                <div class="fl font24">价格：<strong>￥<%=list.get(5).toString() %></strong></div>
            </div>
            <div class="clear"></div>
            <div class="pro_detail_price  margin-t20"><span class="margin-r20">面积：<%=list.get(3).toString() %></span></div>
            <div class="clear"></div>
            <div class="pro_detail_price  margin-t20"><span class="margin-r20">产地：<%=list.get(4).toString() %>  发布用户：<%=list.get(15).toString() %></span></div>
            <div class="clear"></div>
            <div class="pro_detail_price  margin-t20"><span class="margin-r20">规格：<%=list.get(8).toString() %></span></div>
            <div class="clear"></div>
            <div class="pro_detail_price  margin-t20"><span class="margin-r20">浏览：<%=list.get(11).toString() %> &nbsp;
                销量：<%=list.get(12).toString() %> &nbsp;库存：<%=list.get(13).toString() %></span></div>
            <div class="clear"></div>
            <div class="pro_detail_price  margin-t20"><span class="margin-r20"><a href="<%=basePath%>sc/addSc?cpid=<%=id%>">收藏</a></span></div>
            <div class="clear"></div>
            <div class="pro_detail_btn margin-t30">
                <ul>
                    <li class="pro_detail_add"><a href="<%=basePath%>gwc/addGwc?cpid=<%=id%>">加入购物车</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="clear"></div>
    <script>
        $(function(){
            $(".pro_tab li").each(function(i){
                $(this).click(function(){
                    $(this).addClass("cur").siblings().removeClass("cur");
                    $(".conlist .conbox").eq(i).show().siblings().hide();
                })
            })
        })
    </script>
    <div class="pro_con margin-t55" style="overflow:hidden;">
        <div class="pro_tab">
            <ul>
                <li class="cur">种植介绍</li>
                <li>评价</li>
            </ul>
        </div>
        <div class="conlist">
            <div class="conbox" style="display:block;"><%=list.get(7).toString() %></div>
            <div class="conbox">
                <div class="pro_judge">
                    <table width="100%" border="0">
                        <%
                            List pjlist=cb.getCom("select pf,pj,member,sj,mpf,mpj from gwc where cpid='"+id+"' and pf!='暂无' order by id desc",6);
                            if(!pjlist.isEmpty()){
                                for(int i=0;i<pjlist.size();i++){
                                    List list2=(List)pjlist.get(i);
                        %>
                        <tr>
                            <td>买家评分：<%=list2.get(0).toString()%> &nbsp;&nbsp;
                                买家评价：<%=list2.get(1).toString()%><br />
                                <br />
                                <span class="pro_judge_time">
                                    卖家评分：<%=list2.get(4).toString()%>  &nbsp;&nbsp;
                                    卖家评价：<%=list2.get(5).toString()%></span></td>
                            <td>买家：<%=list2.get(2).toString()%>&nbsp;&nbsp;时间：<%=list2.get(3).toString()%></td>
                        </tr>
                        <%}}%>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="clear">&nbsp;</div>
<!--中部内容END-->

<%@ include file="iframe/foot.jsp" %>
