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
        String id="";String mc="";String fl="";String pp="";String cd="";String jg="";String pic=""; String nr="";String cf="";String sl="";String tj="";String sxj="";
        if(method.equals("upcp")){
            id=request.getParameter("id");
            List jlist = cb.get1Com("select * from cp where id='"+id+"'",15);
            mc=jlist.get(1).toString();
            fl=jlist.get(2).toString();
            pp=jlist.get(3).toString();
            cd=jlist.get(4).toString();
            jg=jlist.get(5).toString();
            nr=jlist.get(7).toString();
            htmlData=nr;
            cf=jlist.get(8).toString();
            sl=jlist.get(9).toString();
            tj=jlist.get(10).toString();
            sxj=jlist.get(14).toString();
        }
%>
<body>
<div id="container">
    <div id="bd">
        <div id="main">
            <h2 class="subfild">
                <span></span>
            </h2>
            <form action="<%=basePath%>cp/addCp" method="post" enctype="multipart/form-data">
                <input type="hidden" name="method" value="<%=method%>" /><input type="hidden" name="id" value="<%=id%>" />
                <div class="subfild-content base-info">
                    <div class="kv-item ue-clear">
                        <label>种植名称</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="mc" value="<%=mc %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>种植分类</label>
                        <div class="kv-item-content">
                            <select name="fl" style="height:30px; line-height:30px;width: 300px" required>
                                <%if(method.equals("upcp")){ %>
                                <option value="<%=fl %>"><%=fl %></option>
                                <%}else{%>
                                <option value="">请选择</option>
                                <%} %>
                                <%List flist=cb.getCom("select * from fl order by id asc",2);if(!flist.isEmpty()){for(int i=0;i<flist.size();i++){List list2=(List)flist.get(i);%>
                                <option value=<%=list2.get(1).toString() %>><%=list2.get(1).toString() %></option>
                                <%}} %>
                            </select>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>种植面积</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="pp" value="<%=pp %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>种植产地</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="cd" value="<%=cd %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>种植价格</label>
                        <div class="kv-item-content">
                            <input type="number" min="1" step="0.1" style="width:200px; height:30px;" name="jg" value="<%=jg %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>jpg格式图片</label>
                        <div class="kv-item-content">
                            <%if(method.equals("upcp")){ %>
                            <input type="file" style="width:400px; height:30px;" name="file"/>
                            <%}else{%>
                            <input type="file" style="width:400px; height:30px;" name="file" required/>
                            <%}%>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>种植规格</label>
                        <div class="kv-item-content">
                            <input type="text" style="width:400px; height:30px;" name="cf" value="<%=cf %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear time">
                        <label>种植数量</label>
                        <div class="kv-item-content">
                            <input type="number" min="1" style="width:200px; height:30px;" name="sl" value="<%=sl %>" required/>
                        </div>
                    </div>
                    <div class="kv-item ue-clear">
                        <label>信息详情</label>
                        <div class="kv-item-content">
                            <textarea name="nr" style="width:700px;height:400px;visibility:hidden;"><%=htmlspecialchars(htmlData)%></textarea>
                        </div>
                    </div>

                    <div class="kv-item ue-clear time">
                        <label>上架下架</label>
                        <div class="kv-item-content">
                            <select name="sxj" style="height:30px; line-height:30px;width: 300px" required>
                                <%if(method.equals("upcp")){ %>
                                <option value="<%=sxj %>"><%=sxj %></option>
                                <%}else{%>
                                <option value="">请选择</option>
                                <%} %>
                                <option value="上架">上架</option>
                                <option value="下架">下架</option>
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
