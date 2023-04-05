package com.controller;
/**
 * 上传文件
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.ComBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class UpController {
    String date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    String date2=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

    @RequestMapping( "/uploadfiles")
    public String upLoadfile(@RequestParam(value = "file")MultipartFile uploadFile, HttpServletRequest request) throws IOException{
        HttpSession session = request.getSession();
        String member = (String)session.getAttribute("member");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String realPath = request.getSession().getServletContext().getRealPath("/pic/");
        String format = sdf.format(new Date());
        String oldName = uploadFile.getOriginalFilename();
        String newName = oldName.substring(oldName.indexOf("."), oldName.length());
        File dest  = new File(realPath + format+newName);
        dest.createNewFile();
        if (!dest .isDirectory()){
            dest .mkdirs();
        }
        try {
            uploadFile.transferTo(new File(dest,""));
            String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/pic/" + format + newName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        ComBean cb=new ComBean();
        String url="pic/"+format+newName;
        int flag = cb.comUp("update member set tx='"+url+"' where username='"+member+"' ");
        if(flag == 1){
            request.setAttribute("message", "操作成功！");
            return "member/info/tx";
        }
        else {
            request.setAttribute("message", "操作失败！");
            return "member/info/tx";
        }
    }

    @RequestMapping("download")
    public void download(HttpServletRequest request,HttpServletResponse response) throws Exception {
        String url=request.getParameter("url");
        // 文件地址，真实环境是存放在数据库中的
        String realPath = request.getSession().getServletContext().getRealPath("");
        File file = new File(realPath+url);
        // 穿件输入对象
        FileInputStream fis = new FileInputStream(file);
        // 设置相关格式
        response.setContentType("application/force-download");
        // 设置下载后的文件名以及header
        response.addHeader("Content-disposition", "attachment;fileName=" + url);
        // 创建输出对象
        OutputStream os = response.getOutputStream();
        // 常规操作
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = fis.read(buf)) != -1) {
            os.write(buf, 0, len);
        }
        fis.close();
    }
}
