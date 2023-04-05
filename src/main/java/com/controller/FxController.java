package com.controller;
/**
 * 分享
 */

import com.pojo.Fx;
import com.service.FxService;
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
@RequestMapping("/fx")
public class FxController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    @Autowired
    private FxService fxService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(@RequestParam(value = "file") MultipartFile uploadFile, HttpServletRequest request, Fx fx) throws Exception {
        HttpSession session = request.getSession();
        String member=(String)session.getAttribute("member");
        String method = request.getParameter("method");
        String bh=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime());
        if(method.equals("addfx")){
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
            fx.setUrl("pic/"+bh+newName);
            fx.setMember(member);
            fx.setSj(date);
            int flag = fxService.insertSelective(fx);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "member/fx/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "member/fx/index";
            }
        }
        else {//修改
            String oldName = uploadFile.getOriginalFilename();
            if(!oldName.equals("")){
                String realPath = request.getSession().getServletContext().getRealPath("/pic/");
                String newName = oldName.substring(oldName.indexOf("."), oldName.length());
                File dest  = new File(realPath + bh+newName);
                dest.createNewFile();
                if (!dest .isDirectory()){
                    dest .mkdirs();
                }
                try {
                    uploadFile.transferTo(new File(dest,""));
                    String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/pic/" + bh + newName;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                fx.setUrl("pic/"+bh+newName);
            }
            fx.setMember(member);
            int flag = fxService.updateByPrimaryKeySelective(fx);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "member/fx/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "member/fx/index";
            }
        }
    }

    @RequestMapping("/del/{id}") //删除种植
    public String delMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = fxService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/fx/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/fx/index";
        }
    }
    @RequestMapping("/del2/{id}") //删除种植
    public String delMethod2(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = fxService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/fx/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/fx/index";
        }
    }
}
