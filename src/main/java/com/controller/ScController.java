package com.controller;

import com.pojo.Sc;
import com.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 接收收藏页面请求，处理和转发
 */
@Controller
@RequestMapping("/sc")
public class ScController {

    @Autowired
    private ScService scService;
    @RequestMapping("addSc") //增加收藏
    public String addSc(HttpServletRequest request,Sc sc) {
        HttpSession session = request.getSession();
        String member=(String)session.getAttribute("member");
        if(member==null){
            request.setAttribute("id", sc.getCpid());
            request.setAttribute("message", "请先登录！");
            return "cpinfo";
        }
        else{
            sc.setMember(member);
            String str = scService.getSc(sc);
            if(str==null){
                int flag = scService.insert(sc);
                if(flag == 1){
                    request.setAttribute("id", sc.getCpid());
                    request.setAttribute("message", "操作成功！");
                    return "cpinfo";
                }
                else{
                    request.setAttribute("id", sc.getCpid());
                    request.setAttribute("message", "操作失败！");
                    return "cpinfo";
                }
            }
            else{
                request.setAttribute("id", sc.getCpid());
                request.setAttribute("message", "请勿重复收藏！");
                return "cpinfo";
            }
        }
    }


    @RequestMapping("/del/{id}") //删除收藏
    public String deleteByPrimaryKey(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = scService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/sc/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/sc/index";
        }
    }
    @RequestMapping("batchDel") //删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            scService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "member/sc/index";
    }
}
