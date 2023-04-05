<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/style.css" />
    <link rel="stylesheet" href="<%=basePath%>admin/statics/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/skin_/nav.css" />
    <script type="text/javascript" src="<%=basePath%>admin/statics/js/jquery.js"></script>
    <script type="text/javascript" src="<%=basePath%>admin/statics/js/global.js"></script>
</head>
<%
    String user=(String)session.getAttribute("user");String sf=(String)session.getAttribute("sf");
    if(user==null){
        response.sendRedirect(basePath+"admin/login.jsp");
    }else{
%>
<body>
<div id="container">
    <div id="bd">
        <div class="sidebar">
            <div class="sidebar-bg"></div>
            <i class="sidebar-hide"></i>
            <h2><a href="javascript:;"></i><span>管理功能菜单</span></a></h2>
            <ul class="nav">
                <li class="nav-li current">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">管理中心首页</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>admin/main.jsp" data-id="1">
                            <a href="javascript:;" class="ue-clear"><i class="subnav-icon"></i><span class="subnav-text">管理中心首页</span></a></li>
                    </ul>
                </li>
                <%if(sf.equals("管理员")){%>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">用户信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>admin/system/index.jsp" data-id="2"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">用户信息管理</span></a></li>
                        <li class="subnav-li" href="<%=basePath%>admin/system/index2.jsp" data-id="3"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">个人信息管理</span></a></li>
                        <li class="subnav-li" href="<%=basePath%>admin/system/pwd.jsp" data-id="4"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">登录密码管理</span></a></li>
                    </ul>
                </li>
                <%}else{%>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">用户信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>admin/system/index2.jsp" data-id="3"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">个人信息管理</span></a></li>
                        <li class="subnav-li" href="<%=basePath%>admin/system/pwd.jsp" data-id="4"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">登录密码管理</span></a></li>
                    </ul>
                </li>
                <%}%>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">新闻资讯管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>admin/xw/index.jsp" data-id="5"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">新闻资讯管理</span></a></li>
                    </ul>
                </li>

                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">分类信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>admin/fl/index.jsp" data-id="6"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">分类信息管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">种植信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>admin/cp/index.jsp" data-id="111"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">种植信息管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">注册用户管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>admin/member/index.jsp" data-id="7"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">注册用户管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">咨询留言管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>admin/ly/index.jsp" data-id="12"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">咨询留言管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">分享信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>admin/fx/index.jsp" data-id="819991"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">分享信息管理</span></a></li>
                        <li class="subnav-li" href="<%=basePath%>admin/pl/index.jsp" data-id="819996"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">分享评论管理</span></a></li>
                    </ul>
                </li>
            </ul>
            <div class="tree-list outwindow">
                <div class="tree ztree"></div>
            </div>
        </div>
        <div class="main">
            <div class="title">
                <i class="sidebar-show"></i>
                <ul class="tab ue-clear">

                </ul>
                <i class="tab-more"></i>
                <i class="tab-close"></i>
            </div>
            <div class="content">
            </div>
        </div>
    </div>
</div>

<div class="more-bab-list">
    <ul></ul>
    <div class="opt-panel-ml"></div>
    <div class="opt-panel-mr"></div>
    <div class="opt-panel-bc"></div>
    <div class="opt-panel-br"></div>
    <div class="opt-panel-bl"></div>
</div>
</body>
<script type="text/javascript" src="<%=basePath%>admin/statics/js/nav.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/statics/js/Menu.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/statics/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript">
    var menu = new Menu({
        defaultSelect: $('.nav').find('li[data-id="1"]')
    });

    // 左侧树结构加载
    var setting = {};



    $.fn.zTree.init($(".tree"), setting, zNodes);


    $('.sidebar h2').click(function(e) {
        $('.tree-list').toggleClass('outwindow');
        $('.nav').toggleClass('outwindow');
    });

    $(document).click(function(e) {
        if(!$(e.target).is('.tab-more')){
            $('.tab-more').removeClass('active');
            $('.more-bab-list').hide();
        }
    });
</script>
</html>
<%}%>
