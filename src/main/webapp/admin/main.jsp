<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/style.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/skin_/index.css" />
    <script type="text/javascript" src="<%=basePath%>admin/statics/js/jquery.js"></script>
    <script type="text/javascript" src="<%=basePath%>admin/statics/js/global.js"></script>
    <script type="text/javascript" src="<%=basePath%>admin/statics/js/jquery-ui-1.9.2.custom.min.js"></script>
    <title>首页</title>
</head>
<%
    String user=(String)session.getAttribute("user");
    String sf=(String)session.getAttribute("sf");
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <ul class="content-list">
                <li class="content-item dothings">
                    <h2 class="content-hd">
                        <span class="title">当前用户</span>
                    </h2>
                    <div class="content-bd">
                        <ul class="content-list things">
                            <li class="content-list-item">
                                <i class="icon"></i>
                                <a href="javascript:;">用户：<%=user%></a>
                            </li>
                            <li class="content-list-item">
                                <i class="icon"></i>
                                <a href="javascript:;">身份：<%=sf%></a>
                            </li>
                        </ul>
                    </div>
                </li>

            </ul>
        </div>
    </div>
</div>
</body>

<script type="text/javascript">
    var minwidth = 282;
    resizeWidth();
    $(top.window).resize(function(e) {
        resizeWidth();
    });
    $(function() {
        $( ".content-list" ).sortable({
            revert: true,
            handle:'h2'
        });

    });

    function resizeWidth (){
        if($('#main').width() / 3 < minwidth){
            $('.content-item').width(($('#main').width() / 2) - 15);
        }else{
            $('.content-item').width(($('#main').width() / 3) - 15);
        }

    }
</script>
</html>
