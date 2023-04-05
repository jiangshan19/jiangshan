<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="iframe/head.jsp" %>
<script  language="javascript" >
    function top2(){
        form3.action="<%=basePath%>ly.jsp?page=1";
        form3.submit();
    }
    function last2(){
        if(form3.pageCount.value==0){//如果总页数为0，那么最后一页为1，也就是第一页，而不是第0页
            form3.action="<%=basePath%>ly.jsp?page=1";
            form3.submit();
        }else{
            form3.action="<%=basePath%>ly.jsp?page="+form3.pageCount.value;
            form3.submit();
        }
    }
    function pre2(){
        var page=parseInt(form3.page.value);
        if(page<=1){
            alert("已至第一页");
        }else{
            form3.action="<%=basePath%>ly.jsp?page="+(page-1);
            form3.submit();
        }
    }

    function next2(){
        var page=parseInt(form3.page.value);
        var pageCount=parseInt(form3.pageCount.value);
        if(page>=pageCount){
            alert("已至最后一页");
        }else{
            form3.action="<%=basePath%>ly.jsp?page="+(page+1);
            form3.submit();
        }
    }
    function bjump2(){
        var pageCount=parseInt(form3.pageCount.value);
        if( fIsNumber(form3.busjump.value,"1234567890")!=1 ){
            alert("跳转文本框中只能输入数字!");
            form3.busjump.select();
            form3.busjump.focus();
            return false;
        }
        if(form3.busjump.value>pageCount){//如果跳转文本框中输入的页数超过最后一页的数，则跳到最后一页
            if(pageCount==0){
                form3.action="<%=basePath%>ly.jsp?page=1";
                form3.submit();
            }
            else{
                form3.action="<%=basePath%>ly.jsp?page="+pageCount;
                form3.submit();
            }
        }
        else if(form3.busjump.value<=pageCount){
            var page=parseInt(form3.busjump.value);
            if(page==0){
                page=1;//如果你输入的是0，那么就让它等于1
                form3.action="<%=basePath%>ly.jsp?page="+page;
                form3.submit();
            }else{
                form3.action="<%=basePath%>ly.jsp?page="+page;
                form3.submit();
            }

        }

    }
    //****判断是否是Number.
    function fIsNumber (sV,sR){
        var sTmp;
        if(sV.length==0){ return (false);}
        for (var i=0; i < sV.length; i++){
            sTmp= sV.substring (i, i+1);
            if (sR.indexOf (sTmp, 0)==-1) {return (false);}
        }
        return (true);
    }
</script>
<!--信息列表样式-->
<div class="Inside_pages clearfix">
    <div class="right_style">
        <div class="title_style"><em></em>留言咨询</div>
        <div class="content_style">
            <div class="Bulletin_style">
                <div class="Bulletin_list">
                    <ul class="list">
                        <%
                            cb.setEVERYPAGENUM(15);
                            int cou = cb.getMessageCount("select count(*) from ly ");//得到信息总数
                            String page1=request.getParameter("page");
                            if(page1==null){
                                page1="1";
                            }
                            session.setAttribute("busMessageCount", cou + "");
                            session.setAttribute("busPage", page1);
                            List pagelist1 = cb.getMessage(Integer.parseInt(page1),"select * from ly order by id desc",5);
                            session.setAttribute("qqq", pagelist1);
                            int pageCount = cb.getPageCount(); //得到页数
                            session.setAttribute("busPageCount", pageCount + "");
                            List pagelist3=(ArrayList)session.getAttribute("qqq");
                            if(!pagelist3.isEmpty()){
                                for(int i=0;i<pagelist3.size();i++){
                                    List pagelist2 =(ArrayList)pagelist3.get(i);
                        %>
                        <li class="Bulletin_content">
                            <p class="Bulletin_time">时间：<%=pagelist2.get(3).toString()%> 用户：<%=pagelist2.get(2).toString()%></p>
                            <p>内容：<%=pagelist2.get(1).toString()%></p>
                            <p>回复：<%=pagelist2.get(4).toString()%></p>
                        </li>
                        <%}%>
                    </ul>
                    <div class="Paging">
                        <div class="Pagination">
                            <form action="" method="post" name="form3">
                                <input type="hidden" name="pageCount" value="<%= session.getAttribute("busPageCount").toString()%>" /><!--//用于给上面javascript传值-->
                                <input type="hidden" name="page" value="<%=session.getAttribute("busPage").toString()%>" /><!--//用于给上面javascript传值-->
                                <a href="#" onClick="top2()">&lt;&lt;</a>&nbsp;&nbsp;&nbsp;
                                <a href="#" onClick="pre2()">&lt;</a>&nbsp;&nbsp;&nbsp;
                                共<%=session.getAttribute("busMessageCount").toString()%>条&nbsp;&nbsp;<%=session.getAttribute("busPageCount").toString()%>页
                                &nbsp;&nbsp;第<%=session.getAttribute("busPage").toString()%>页&nbsp;&nbsp;&nbsp;
                                <a href="#" onClick="next2()">&gt;</a>&nbsp;&nbsp;&nbsp;
                                <a href="#" onClick="last2()">&gt;&gt;</a>&nbsp;&nbsp;&nbsp;
                                第&nbsp;<input name="busjump" type="text" style="width:50px; height:30px;"/>&nbsp;页&nbsp; <a href="#" onClick="bjump2()">&nbsp;确定</a></span>
                            </form>
                        </div>
                    </div>
                    <%}%>
                </div>
            </div>
        </div>
    </div>
</div>
<!--信息列表样式END-->
<!--输入样式-->
<%if(member!=null){%>
<div class="Inside_pages clearfix">
    <div class="right_style">
        <div class="title_style"><em></em>留言</div>
        <form action="<%=basePath%>ly/addMethod" method="post" name="">
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
<p align="center">登录后可以留言！</p></br></br>
<%}%>
<!--输入样式END-->
<%@ include file="iframe/foot.jsp" %>