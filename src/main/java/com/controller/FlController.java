package com.controller;
/**
 * 接收分类页面请求，处理和转发
 */

import com.pojo.Fl;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.service.FlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/fl")
public class FlController {

    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    //String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    @Autowired
    private FlService flService;

    @RequestMapping("/addFl") //增加分类
    public String addFl(HttpServletRequest request, Fl fl) {
        String method = request.getParameter("method");
        if(method.equals("addfl")){
            String mc=fl.getMc();
            String str = flService.getSame(mc);
            if(str==null) {
                int flag = flService.insert(fl);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/fl/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/fl/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/fl/index";
            }
        }
        else {//修改分类
            String str = flService.upgetSame(fl);
            if(str==null) {
                int flag = flService.updateByPrimaryKey(fl);
                if(flag==1){
                    request.setAttribute("message", "操作成功！");
                    return "admin/fl/index";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "admin/fl/index";
                }
            }
            else{
                request.setAttribute("message", "信息重复！");
                return "admin/fl/index";
            }
        }
    }

    @RequestMapping("/del/{id}") //删除分类
    public String deleteFl(HttpServletRequest request,@PathVariable("id") int id) {
        int flag = flService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/fl/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/fl/index";
        }
    }
    @RequestMapping("batchDel") //删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            flService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/fl/index";
    }
}
