<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="iframe/head.jsp" %>

<!--购物车-->
<form action="<%=basePath%>gwdd/tjDd" method="post" name="form1">
    <div class="Inside_pages clearfix">
        <div class="right_style">
            <div class="title_style"><em></em>购物车</div>
            <div class="content_style">
                <div class="Order_form_style">
                    <div class="Order_form_list">
                        <%
                            float sum=0;int sl=0;
                            if(member!=null) {
                                List gwcList = cb.getCom("select * from gwc where member='"+member+"' and ddbh='000' order by id desc",9);
                                if(!gwcList.isEmpty()){
                        %>
                        <table>
                            <thead>
                            <tr>
                                <td class="list_name_title0">种植</td>
                                <td class="list_name_title1">单价(元)</td>
                                <td class="list_name_title2">数量</td>
                                <td class="list_name_title4">小计</td>
                                <td class="list_name_title6">操作</td>
                            </tr>
                            </thead>
                            <tbody>
                            <%
                                        for(int i=0;i<gwcList.size();i++){
                                            List list2 =(ArrayList)gwcList.get(i);
                                            sl+=Integer.parseInt(list2.get(3).toString());
                                            sum+=Float.parseFloat(list2.get(5).toString());
                                            String imgUrl = cb.getString("select url from cp where id='"+list2.get(1).toString()+"'");
                            %>
                            <tr class="Order_Details">
                                <td>
                                    <div class="product_name clearfix">
                                        <a href="<%=basePath%>cpinfo.jsp?id=<%=list2.get(1).toString()%>" class="product_img" target="_blank">
                                            <img src="<%=basePath+imgUrl%>" width="80px" height="80px"></a>
                                        <a href="<%=basePath%>cpinfo.jsp?id=<%=list2.get(1).toString()%>" target="_blank"><font size="3"><%=list2.get(2).toString()%></font></a>
                                        <p class="specification">分类：<%=list2.get(8).toString()%> </p>
                                    </div>
                                </td>
                                <td>￥<%=list2.get(4).toString()%></td>
                                <td><input type="number" min="1" id="<%=list2.get(0).toString()%>_count" value="<%=list2.get(3).toString()%>"
                                           style="width:70px; text-align:center; height:30px; border:1px solid #dddddd;" required/></td>
                                <td>￥<%=list2.get(5).toString()%></td>
                                <td>
                                    <a href="javascript:go('<%=list2.get(0).toString()%>')"><font size="3">修改</font></a>
                                    <script type="text/javascript">
                                        function go(proId)
                                        {
                                            var str;
                                            str="<%=basePath%>gwc/upGwc?count=";
                                            str+=document.getElementById(proId+"_count").value;
                                            str+="&";
                                            str+="proId=";
                                            str+=proId;
                                            window.location=str;
                                        }
                                        function go2(proId)
                                        {
                                            var str;
                                            str="<%=basePath%>gwc/del/<%=list2.get(0).toString()%>";
                                            window.location=str;
                                        }
                                    </script>
                                    <a href="javascript:go2('<%=list2.get(0).toString()%>')"><font size="3">删除</font></a>
                                </td>
                            </tr>

                            <%} %>
                            <tr>
                                <td class="list_name_title0" colspan="5">
                                    共<span style="color:#F00; font-size:14px;"><%=sl%></span>件种植，
                                    种植总价：<span style="color:#F00; font-size:15px;">￥<%=sum%></span>
                                </td>
                            </tr>
                            <tr>
                                <td class="list_name_title0" colspan="5">
                                    联系人：<input name="xm" type="text" style="width:100px; height:25px;" required />
                                    手机号码：<input name="dh" type="text" pattern="[0-9]{11}" title="11位手机号码" style="width:150px; height:25px;" required />
                                    联系地址：<input name="dz" type="text" style="width:200px; height:25px;" required />
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div> <p align="right">
                <input name="" type="button" onclick="window.location='<%=basePath%>index.jsp'" value="继续购物"  class="Search_btn"/>
                <input name="" type="submit" value="提交订单"  class="Search_btn"/></p>
                <%}else{%>
                <p align="center"><img src="<%=basePath%>statics/images/zw.jpg"></p>
                <%}}else{%><p align="center"><img src="<%=basePath%>statics/images/zw.jpg"></p><%}%>
            </div>
        </div>
    </div>
</form>
<!--购物车END-->

<%@ include file="iframe/foot.jsp" %>
