<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="cb" class="com.bean.ComBean"/>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    List cplistt=cb.getCom("select * from cp order by id desc",2);
    if(!cplistt.isEmpty()){
        for(int i=0;i<cplistt.size();i++){
            List list2=(List)cplistt.get(i);
            int xl=cb.getCount("select sum(sl) from gwc where cpid='"+list2.get(0).toString()+"' and ddbh!='暂无'");
            String sl=cb.getString("select sl from cp where id='"+list2.get(0).toString()+"'");
            int kc=Integer.parseInt(sl)-xl;
            cb.comUp("update cp set xl='"+xl+"',kc='"+kc+"' where id='"+list2.get(0).toString()+"'");
        }
    }
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="<%=basePath%>statics/css/common.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>statics/css/style.css" rel="stylesheet" type="text/css" />

    <link href="<%=basePath%>statics/css/base.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>statics/css/supplie.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>statics/css/style1.css" rel="stylesheet" type="text/css" />
    <script src="<%=basePath%>statics/js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <script src="<%=basePath%>statics/js/js/jquery.SuperSlide.2.1.1.js" type="text/javascript"></script>
    <script src="<%=basePath%>statics/js/js/common_js.js" type="text/javascript"></script>
    <script src="<%=basePath%>statics/js/js/footer.js" type="text/javascript"></script>
    <script src="<%=basePath%>statics/js/jquery.simpleGal.js"></script>
</head>
<body>
<div id="header_top">
    <div id="top">
        <div class="Inside_pages">
            <div class="Collection">
                <%
                    String member=(String)session.getAttribute("member");
                    if(member==null){
                %>
                <a href="<%=basePath%>login.jsp" class="green"> 登录</a>
                <a href="<%=basePath%>reg.jsp" class="green">注册</a>
                <%}else{ %>
                欢迎：<%=member %>
                <a href="<%=basePath%>member/index.jsp" class="green">用户中心</a>
                <a href="<%=basePath%>member/toExit" class="green">注销退出</a>
                <%} %>
            </div>
        </div>
    </div>
    <div id="header"  class="header page_style">
        <div class="logo"><a href=""><img src="<%=basePath%>statics/images/logo.jpg" /></a></div>
        <!--搜索-->
        <div class="Search">
            <div class="search_list"><ul><li></li> </ul></div>
            <form name="sform" method="post" action="<%=basePath%>sinfo.jsp">
                <div class="clear search_cur">
                    <input name="word" class="search_box" placeholder="请输入您要搜索的种植项目" type="text">
                    <input name="" type="submit" value="搜 索"  class="Search_btn"/>
                </div>
            </form>
            <div class="clear hotword"></div>
        </div>
    <!--搜索END-->
    <!--购物车样式-->
    <div class="hd_Shopping_list" id="Shopping_list">
        <div class="s_cart"><a href="<%=basePath%>gwc.jsp">我的购物车</a>
            <%if(member!=null){%>
            <i class="ci-right">&gt;</i><i class="ci-count" id="shopping-amount">
                <%=cb.getCount("select sum(sl) from gwc where member='"+member+"' and ddbh='000' ") %>
            </i>
            <%}%>
        </div>
    </div>
</div>
<!--购物车样式END-->
    <!--菜单栏-->
    <div class="Navigation" id="Navigation">
        <ul class="Navigation_name">
            <li><a href="<%=basePath%>index.jsp">首页</a></li>
            <li><a href="<%=basePath%>cp.jsp">最新种植</a></li>
            <li><a href="<%=basePath%>tj.jsp">推荐种植</a></li>
            <li><a href="<%=basePath%>rx.jsp">热销种植</a><em class="hot_icon"></em></li>
            <li><a href="<%=basePath%>s.jsp">复合查询</a></li>
            <li><a href="<%=basePath%>xw.jsp">新闻资讯</a></li>
            <li><a href="<%=basePath%>fx.jsp">分享信息</a></li>
            <li><a href="<%=basePath%>ly.jsp">咨询留言</a></li>
        </ul>
    </div>
</div>
<!--菜单栏END-->
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
%>
