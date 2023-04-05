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

    String username=(String)session.getAttribute("user");
    if(username==null){
        response.sendRedirect(path+"index.jsp");
    }
    else{
        String method=request.getParameter("method");
        String id=""; String tj="";
        if(method.equals("upcp")){
            id=request.getParameter("id");
            List jlist = cb.get1Com("select * from cp where id='"+id+"'",15);
            tj=jlist.get(10).toString();
        }
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form action="<%=basePath%>cp/tjcp" method="post">
                <input type="hidden" name="id" value="<%=id%>" />
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear time">
                        <label>种植推荐</label>
                        <div class="kv-item-content">
                            <select name="tj" style="height:30px; line-height:30px;width: 300px" required>
                                <option value="<%=tj %>"><%=tj %></option>
                                <option value="">请选择</option>
                                <option value="是">是</option>
                                <option value="否">否</option>
                            </select>
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
