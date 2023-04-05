package com.controller;
/**
 * 接收种植页面请求，处理和转发
 */

import com.pojo.Cp;
import com.service.CpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@RequestMapping("/cp")
public class CpController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

    @Autowired
    @Qualifier("cpServiceImpl")
    private CpService cpService;

    @RequestMapping("/addCp") //增加种植
    public String addCp(@RequestParam(value = "file")MultipartFile uploadFile, HttpServletRequest request, Cp cp) throws Exception {
        HttpSession session = request.getSession();
        String member=(String)session.getAttribute("member");
        String method = request.getParameter("method");
        String bh=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime());
        if(method.equals("addcp")){
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
            cp.setUrl("pic/"+bh+newName);
            cp.setMember(member);
            int flag = cpService.insertSelective(cp);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "member/cp/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "member/cp/index";
            }
        }
        else {//修改种植
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
                cp.setUrl("pic/"+bh+newName);
            }
            cp.setMember(member);
            int flag = cpService.updateByPrimaryKeySelective(cp);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "member/cp/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "member/cp/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除种植
    public String deleteCp(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = cpService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/cp/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/cp/index";
        }
    }
    @RequestMapping("batchDel") //删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            cpService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "member/cp/index";
    }

    @RequestMapping("/del2/{id}") //删除种植
    public String deleteCp2(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = cpService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/cp/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/cp/index";
        }
    }
    @RequestMapping("batchDel2") //删除
    public String batchDel2(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            cpService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/cp/index";
    }
    @RequestMapping("/tjcp")
    public String addDz(HttpServletRequest request, Cp cp) {
        int flag = cpService.updateByPrimaryKeySelective(cp);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/cp/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/cp/index";
        }
    }
}
