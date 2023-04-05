<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="iframe/head.jsp" %>
<div class="clear">&nbsp;</div>


<!--中部内容-->
<div class="sup-wid">
    <div class="mainbody">
        <div class="product-categories">
            <div class="title">种植分类</div>
            <div class="see-all">
                <ul class="fenlei">
                    <%List fllist=cb.getCom("select * from fl order by id desc",2);
                        if(!fllist.isEmpty()){
                            for(int i=0;i<fllist.size();i++){
                                List list2=(List)fllist.get(i);
                    %>
                    <li><a href="<%=basePath%>fl.jsp?fl=<%=list2.get(1).toString()%>"><%=list2.get(1).toString()%></a></li>
                    <%}} %>
                </ul>
            </div>
            <div class="sidebar2">
                <div class="title">种植推荐</div>
                <div class="see-all">
                    <%List tjlist = cb.getCom("select * from cp where tj='是' and sxj='上架' order by id desc limit 6",7);
                        if(!tjlist.isEmpty()){
                            for (int i=0;i<tjlist.size();i++){
                                List list2 = (List)tjlist.get(i);
                    %>
                    <ul class="item-recommend">
                        <li><a href="<%=basePath%>cpinfo.jsp?id=<%=list2.get(0).toString()%>">
                            <img src="<%=basePath+list2.get(6).toString()%>" width="172" height="150" /></a></li>
                        <li><a href="<%=basePath%>cpinfo.jsp?id=<%=list2.get(0).toString()%>"><%=list2.get(1).toString()%>称
                        </br>数量：<%=list2.get(3).toString()%></a></li>
                        <li class="price">¥<strong><%=list2.get(5).toString()%></strong></li>
                    </ul>
                    <%}}%>
                </div>
            </div>
        </div>
        <div class="new-pro">
            <div class="tit"><a href="">最新种植</a></div>
            <div class="item4line1">
                <%List zxlist = cb.getCom("select * from cp where sxj='上架' order by id desc limit 8",13);
                    if(!zxlist.isEmpty()){
                        for (int i=0;i<zxlist.size();i++){
                            List list2 = (List)zxlist.get(i);
                %>
                <ul style="margin-right:18px;">
                    <li><a href="<%=basePath%>cpinfo.jsp?id=<%=list2.get(0).toString()%>"><img src="<%=basePath+list2.get(6).toString()%>" width="250" height="250"/></a></li>
                    <li><a href="<%=basePath%>cpinfo.jsp?id=<%=list2.get(0).toString()%>"><%=list2.get(1).toString()%></a></li>
                    <li class="price"><strong>¥<%=list2.get(5).toString()%></strong> <span>已售：<%=list2.get(12).toString()%>
                     </span></li>
                </ul>
                <%}}%>
            </div>
        </div>
        <div class="new-pro">
            <div class="tit"><a href="">热销种植</a></div>
            <div class="item4line1">
                <%List xlist = cb.getCom("select * from cp where sxj='上架' order by xl desc limit 8",13);
                    if(!xlist.isEmpty()){
                        for (int i=0;i<xlist.size();i++){
                            List list2 = (List)xlist.get(i);
                %>
                <ul style="margin-right:18px;">
                    <li><a href="<%=basePath%>cpinfo.jsp?id=<%=list2.get(0).toString()%>"><img src="<%=basePath+list2.get(6).toString()%>" width="250" height="250"/></a></li>
                    <li><a href="<%=basePath%>cpinfo.jsp?id=<%=list2.get(0).toString()%>"><%=list2.get(1).toString()%></a></li>
                    <li class="price"><strong>¥<%=list2.get(5).toString()%></strong> <span>已售：<%=list2.get(12).toString()%></span></li>
                </ul>
                <%}}%>
            </div>
        </div>
    </div>
</div>
<!--中部内容END-->
<%@ include file="iframe/foot.jsp" %>
