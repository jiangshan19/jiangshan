package com.controller;
/**
 * 留言回复
 *
 */

import com.pojo.Dd;
import com.pojo.Ly;
import com.pojo.Wl;
import com.service.DdService;
import com.service.WlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
@RequestMapping("/wl")
public class WlController {
    String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    @Autowired
    private WlService wlService;
    private DdService ddService;

    public WlController(DdService ddService) {
        this.ddService = ddService;
    }

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Wl wl) {
        HttpSession session = request.getSession();
        String member = (String)session.getAttribute("member");
        String ddid = request.getParameter("ddid");
        Dd dd=ddService.selectByPrimaryKey(Integer.parseInt(ddid));
        wl.setFmember(member);
        wl.setBh(dd.getDdbh());
        wl.setJmember(dd.getMember());
        wl.setSj(date2);
        int flag = wlService.insertSelective(wl);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/wl/f";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/wl/f";
        }
    }
    @RequestMapping("/addMethod2") //增加
    public String addMethod2(HttpServletRequest request, Wl wl) {
        HttpSession session = request.getSession();
        String member = (String)session.getAttribute("member");
        String ddid = request.getParameter("ddid");
        Dd dd=ddService.selectByPrimaryKey(Integer.parseInt(ddid));
        wl.setFmember(member);
        wl.setBh(dd.getDdbh());
        wl.setJmember(dd.getGys());
        wl.setSj(date2);
        int flag = wlService.insertSelective(wl);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/wl/f";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/wl/f";
        }
    }
    @RequestMapping("/upMethod") //回复
    public String upMethod(HttpServletRequest request, Wl wl) throws Exception {
        int flag = wlService.updateByPrimaryKeySelective(wl);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/wl/s";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/wl/s";
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deletewl(HttpServletRequest request,@PathVariable("id") int id) {
        int flag = wlService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/wl/f";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/wl/f";
        }
    }
    @RequestMapping("/del2/{id}") //删除
    public String deletewl2(HttpServletRequest request,@PathVariable("id") int id) {
        int flag = wlService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/wl/s";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/wl/s";
        }
    }

}
