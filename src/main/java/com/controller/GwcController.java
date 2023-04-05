package com.controller;
/**
 * 接收购物车页面请求，处理和转发
 */

import com.pojo.Gwc;
import com.pojo.Cp;
import com.service.GwcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

@Controller
@RequestMapping("/gwc")
public class GwcController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

    @Autowired
    @Qualifier("gwcServiceImpl")
    private GwcService gwcService;

    @RequestMapping("addGwc") //增加购物车种植
    public String addGwc(HttpServletRequest request,Gwc gwc) {
        HttpSession session = request.getSession();
        String member=(String)session.getAttribute("member");
        String msf=(String)session.getAttribute("msf");
        if(member==null||msf.equals("基地")){
            request.setAttribute("id", gwc.getCpid());
            request.setAttribute("message", "请先以用户身份登录！");
            return "cpinfo";
        }
        else{
            gwc.setMember(member);
            gwc.setDdbh("000");
            String str = gwcService.getGwc(gwc);
            if(str==null){
                Cp cp = gwcService.getQueryData(gwc.getCpid());
                String cpmc = cp.getMc();
                String fl = cp.getFl();
                float jg = cp.getJg();
                float zj=0;
                int sl=1;
                zj=sl*jg;
                gwc.setCpmc(cpmc);
                gwc.setSl(sl);
                gwc.setJg(String.valueOf(jg));
                gwc.setZj(zj);
                gwc.setMember(member);
                gwc.setDdbh("000");
                gwc.setFl(fl);
                gwc.setSj(date);
                gwc.setGys(cp.getMember());
                int flag = gwcService.insertSelective(gwc);
                if(flag == 1){
                    request.setAttribute("message", "成功将一件种植加入购物车！");
                    return "gwc";
                }
                else{
                    request.setAttribute("id", gwc.getCpid());
                    request.setAttribute("message", "操作失败！");
                    return "cpinfo";
                }
            }
            else{
                request.setAttribute("id", gwc.getCpid());
                request.setAttribute("message", "请勿重复加入购物车，修改数量请在购物车内修改！");
                return "cpinfo";
            }
        }
    }
    @RequestMapping("upGwc") //修改数量
    public String upGwc(HttpServletRequest request,Gwc gwc){
        String proId=request.getParameter("proId");
        String count = request.getParameter("count");
        float zj=0;
        int sl=Integer.parseInt(count);
        gwc = gwcService.selectByPrimaryKey(Integer.parseInt(proId));
        String cpid = gwc.getCpid();
        //加库存判断
        int kc = gwcService.getKc(cpid);
        if(kc>=sl){
            Cp cp = gwcService.getQueryData(cpid);
            float jg = cp.getJg();
            zj = jg*sl;
            String cpmc = cp.getMc();
            String fl = cp.getFl();
            gwc.setCpmc(cpmc);
            gwc.setSl(sl);
            gwc.setJg(String.valueOf(jg));
            gwc.setZj(zj);
            gwc.setFl(fl);
            int flag = gwcService.updateByPrimaryKeySelective(gwc);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "gwc";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "gwc";
            }
        }
        else{
            request.setAttribute("message", "库存数量"+kc+"，购买数量"+sl+"，库存不足！");
            return "gwc";
        }
    }
    @RequestMapping("/del/{id}") //删除购物车种植
    public String deleteGwc(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = gwcService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "gwc";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "gwc";
        }
    }
}
