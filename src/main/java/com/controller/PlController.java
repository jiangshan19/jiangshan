package com.controller;
/**
 * 评论
 */

import com.pojo.Fx;
import com.pojo.Pl;
import com.service.FxService;
import com.service.PlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
@RequestMapping("/pl")
public class PlController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    @Autowired
    private PlService plService;
    private FxService fxService;

    public PlController(FxService fxService) {
        this.fxService = fxService;
    }

    @RequestMapping("addMethod") //增加
    public String addMethod(HttpServletRequest request, Pl pl) {
        HttpSession session = request.getSession();
        String member=(String)session.getAttribute("member");
        if(member==null){
            request.setAttribute("id", pl.getFxid());
            request.setAttribute("message", "请先登录！");
            return "fxinfo";
        }
        else{
            pl.setMember(member);
            pl.setSj(date);
            Fx fx = fxService.selectByPrimaryKey(Integer.parseInt(pl.getFxid()));
            pl.setBt(fx.getBt());
            int flag = plService.insertSelective(pl);
            if(flag == 1){
                request.setAttribute("id", pl.getFxid());
                request.setAttribute("message", "操作成功！");
                return "fxinfo";
            }
            else{
                request.setAttribute("id", pl.getFxid());
                request.setAttribute("message", "操作失败！");
                return "fxinfo";
            }
        }
    }

    @RequestMapping("/del/{id}") //删除
    public String deleteByPrimaryKey(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = plService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/pl/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/pl/index";
        }
    }
}
