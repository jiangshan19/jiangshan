<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="cb" scope="page" class="com.bean.ComBean" />
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    String htmlData = request.getParameter("nr") != null ? request.getParameter("nr") : "";
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/style.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/statics/css/skin_/form.css" />
    <script type="text/javascript" src="<%=basePath%>admin/statics/js/jquery.js"></script>
    <link rel="stylesheet" href="<%=basePath %>editor/themes/default/default.css" />
    <link rel="stylesheet" href="<%=basePath %>editor/plugins/code/prettify.css" />
    <script charset="utf-8" src="<%=basePath %>editor/kindeditor.js"></script>
    <script charset="utf-8" src="<%=basePath %>editor/lang/zh_CN.js"></script>
    <script charset="utf-8" src="<%=basePath %>editor/plugins/code/prettify.js"></script>
    <script>
        KindEditor.ready(function(K) {
            var editor1 = K.create('textarea[name="nr"]', {
                cssPath : '<%=basePath %>editor/plugins/code/prettify.css',
                uploadJson : '<%=basePath %>editor/jsp/upload_json.jsp',
                fileManagerJson : '<%=basePath %>editor/jsp/file_manager_json.jsp',
                allowFileManager : true,
                afterCreate : function() {
                    var self = this;
                    K.ctrl(document, 13, function() {
                        self.sync();
                        document.forms['form1'].submit();
                    });
                    K.ctrl(self.edit.doc, 13, function() {
                        self.sync();
                        document.forms['form1'].submit();
                    });
                }
            });
            prettyPrint();
        });
    </script>
</head>
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

    String member=(String)session.getAttribute("member");
    if(member==null){
        response.sendRedirect(path+"index.jsp");
    }
    else{
        String method=request.getParameter("method");
        String id="";String bt="";String fl=""; String pic=""; String nr="";
        if(method.equals("upfx")){
            id=request.getParameter("id");
            List jlist = cb.get1Com("select * from fx where id='"+id+"'",5);
            bt=jlist.get(1).toString();
            fl=jlist.get(2).toString();
            nr=jlist.get(4).toString();
            htmlData=nr;
        }
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form action="<%=basePath%>fx/addMethod" method="post" enctype="multipart/form-data">
                <input type="hidden" name="method" value="<%=method%>" /><input type="hidden" name="id" value="<%=id%>" />
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label>信息标题</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="bt" value="<%=bt %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>信息来源</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="fl" value="<%=fl %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>jpg格式图片</label>
                        <div class="kv-item-content">
                            <%if(method.equals("upfx")){ %>
                            <input type="file" style="width:400px; height:30px;" name="file"/>
                            <%}else{%>
                            <input type="file" style="width:400px; height:30px;" name="file" required/>
                            <%}%>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>信息详情</label>
                        <div class="kv-item-content">
                            <textarea name="nr" style="width:700px;height:400px;visibility:hidden;"><%=htmlspecialchars(htmlData)%></textarea>
                        </div>
                    </div>
                <div class="buttons">
                    <input class="button" type="submit" value="确定提交" />
                </div>
        </div>
        </form>
    </div>
</div>
</body>
</html>
<%} %>
<%!
    private String htmlspecialchars(String str) {
        str = str.replaceAll("&", "&amp;");
        str = str.replaceAll("<", "&lt;");
        str = str.replaceAll(">", "&gt;");
        str = str.replaceAll("\"", "&quot;");
        return str;
    }
%>
