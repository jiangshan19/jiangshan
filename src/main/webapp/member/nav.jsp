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
    <link rel="stylesheet" type="text/css" href="<%=basePath%>member/statics/css/style.css" />
    <link rel="stylesheet" href="<%=basePath%>member/statics/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>member/statics/css/skin_/nav.css" />
    <script type="text/javascript" src="<%=basePath%>member/statics/js/jquery.js"></script>
    <script type="text/javascript" src="<%=basePath%>member/statics/js/global.js"></script>
</head>
<%
    String member=(String)session.getAttribute("member");String msf=(String)session.getAttribute("msf");
    if(member==null){
        response.sendRedirect(basePath+"login.jsp");
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
                        <li class="subnav-li" href="<%=basePath%>member/main.jsp" data-id="1">
                            <a href="javascript:;" class="ue-clear"><i class="subnav-icon"></i><span class="subnav-text">管理中心首页</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">个人信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/info/index.jsp" data-id="3"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">个人信息管理</span></a></li>
                        <li class="subnav-li" href="<%=basePath%>member/info/pwd.jsp" data-id="4"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">登录密码管理</span></a></li>
                        <li class="subnav-li" href="<%=basePath%>member/info/tx.jsp" data-id="5"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">用户头像管理</span></a></li>
                    </ul>
                </li>
                <%if(msf.equals("基地")){%>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">种植信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/cp/index.jsp" data-id="111"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">种植信息管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">订单信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/gd/index.jsp" data-id="8"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">订单信息管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">评价信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/gd/pj.jsp" data-id="81"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">评价信息管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">数据统计分析</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/tj/index.jsp" data-id="9"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">数据统计报表</span></a></li>
                        <li class="subnav-li" href="<%=basePath%>member/tj/fx.jsp" data-id="11"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">数据统计分析</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">种植进度管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/jd/index.jsp" data-id="138"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">种植进度管理</span></a></li>
                    </ul>
                </li>
                <%}else{%>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">订单信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/dd/index.jsp" data-id="7"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">订单信息管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">收藏信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/sc/index.jsp" data-id="8"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">收藏信息管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">分享信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/fx/index.jsp" data-id="631"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">分享信息管理</span></a></li>
                    </ul>
                </li>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">种植进度管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/jd/index2.jsp" data-id="1138"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">种植进度管理</span></a></li>
                    </ul>
                </li>
                <%}%>
                <li class="nav-li">
                    <a href="javascript:;" class="ue-clear"><i class="nav-ivon"></i><span class="nav-text">留言信息管理</span></a>
                    <ul class="subnav">
                        <li class="subnav-li" href="<%=basePath%>member/wl/f.jsp" data-id="82345"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">发送留言管理</span></a></li>
                        <li class="subnav-li" href="<%=basePath%>member/wl/s.jsp" data-id="823145"><a href="javascript:;" class="ue-clear">
                            <i class="subnav-icon"></i><span class="subnav-text">收到留言管理</span></a></li>
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
<script type="text/javascript" src="<%=basePath%>member/statics/js/nav.js"></script>
<script type="text/javascript" src="<%=basePath%>member/statics/js/Menu.js"></script>
<script type="text/javascript" src="<%=basePath%>member/statics/js/jquery.ztree.core-3.5.js"></script>
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
