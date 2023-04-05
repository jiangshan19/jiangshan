package com.controller;
/**
 * 进度
 */
import com.bean.ComBean;
import com.pojo.Jd;
import com.service.JdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
@RequestMapping("/jd")
public class JdController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    @Autowired
    private JdService jdService;

    @RequestMapping("/addMethod") //增加种植
    public String addMethod(@RequestParam(value = "file") MultipartFile uploadFile, HttpServletRequest request, Jd jd) throws Exception {
        HttpSession session = request.getSession();
        String member=(String)session.getAttribute("member");
        String ddid = request.getParameter("ddid");
        String bh=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime());
        String realPath = request.getSession().getServletContext().getRealPath("/pic/");
        // System.out.println(realPath+"--------------");
        String oldName = uploadFile.getOriginalFilename();
        String newName = oldName.substring(oldName.indexOf("."), oldName.length());
        // System.out.println(bh+newName+"-------newName-------");
        File dest  = new File(realPath + bh+newName);
        dest.createNewFile();
        if (!dest .isDirectory()){
            dest .mkdirs();
        }
        try {
            uploadFile.transferTo(new File(dest,""));
            String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/pic/" + bh + newName;
            // System.out.println(path+"--------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
        jd.setUrl("pic/"+bh+newName);
        jd.setFmember(member);
        String jmember=new ComBean().getString("select member from dd where id='"+ddid+"'");
        jd.setJmember(jmember);
        jd.setSj(date);
        int flag = jdService.insertSelective(jd);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/jd/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/jd/index";
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String delMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = jdService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/jd/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/jd/index";
        }
    }
    @RequestMapping("/del2/{id}") //删除
    public String delMethod2(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = jdService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/jd/index2";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/jd/index2";
        }
    }
}
