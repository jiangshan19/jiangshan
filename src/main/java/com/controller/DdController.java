package com.controller;
/**
 * 接收订单页面请求，处理和转发
 */
import com.bean.ComBean;
import com.pojo.Dd;
import com.pojo.Gwc;
import com.service.DdService;
import com.service.GwcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/gwdd")
public class DdController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    @Autowired
    private DdService ddService;
    private GwcService gwcService;

    public DdController(GwcService gwcService) {
        this.gwcService = gwcService;
    }

    @RequestMapping("/tjDd") //提交订单
    public String tjDd(HttpServletRequest request, Dd dd) {
        HttpSession session = request.getSession();
        String member=(String)session.getAttribute("member");
        List list=new ComBean().getCom("select distinct(gys) from gwc where member='"+member+"' and ddbh='000'",1);
        if(!list.isEmpty()){
            for(int i=0;i<list.size();i++){
                List list2=(List)list.get(i);
                String gys=list2.get(0).toString();
                float zj = new ComBean().getFloat("select sum(zj) from gwc where member='"+member+"' and ddbh='000' and gys='"+gys+"'");
                String ddbh=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime());
                dd.setDdbh(ddbh);
                dd.setZj(zj);
                dd.setMember(member);
                dd.setSj(date2);
                dd.setGys(gys);
                int flag = ddService.insertSelective(dd);
                if(flag==1){
                    Gwc gwc = new Gwc();
                    gwc.setDdbh(ddbh);
                    gwc.setMember(member);
                    gwc.setGys(gys);
                    gwc.setCpmc("000");
                    gwcService.upDdbh(gwc);
                }
            }
        }
        request.setAttribute("message", "提交成功请付款！");
        return "ewm";
//        String ddbh=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime());
//        dd.setDdbh(ddbh);
//        dd.setMember(member);
//        dd.setSj(date2);
//        int flag = ddService.insertSelective(dd);
//        if(flag==1){
//            Gwc gwc = new Gwc();
//            gwc.setDdbh(ddbh);
//            gwc.setMember(member);
//            gwc.setCpmc("000");
//            gwcService.upDdbh(gwc);
//            request.setAttribute("message", "提交成功请付款！");
//            return "ewm";
//        }
//        else{
//            request.setAttribute("message", "操作失败！");
//            return "gwc";
//        }
    }
    @RequestMapping("/eWm")
    public String eWm(HttpServletRequest request) {
        request.setAttribute("message", "操作成功！可在用户中心查看订单信息！");
        return "gwc";
    }
    @RequestMapping("/del/{id}") //用户删除订单
    public String deleteDd(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = ddService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/dd/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/dd/index";
        }
    }

    @RequestMapping("/upPfpj")//用户评价
    public String upPfpj(HttpServletRequest request, Gwc gwc){
        String gwcid = request.getParameter("gwcid");
        String ddbh = request.getParameter("ddbh");
        gwc.setId(Integer.parseInt(gwcid));
        int flag = gwcService.updateByPrimaryKeySelective(gwc);
        if(flag == 1){
            request.setAttribute("ddbh", ddbh);
            request.setAttribute("message", "操作成功！");
            return "member/dd/pj";
        }
        else{
            request.setAttribute("ddbh", ddbh);
            request.setAttribute("message", "操作失败！");
            return "member/dd/pj";
        }
    }

    @RequestMapping("/mdel/{id}") //卖家删除订单------------------------
    public String mdeleteDd(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = ddService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/gd/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/gd/index";
        }
    }
    @RequestMapping("mbatchDel") //删除
    public String mbatchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            ddService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "member/gd/index";
    }


    @RequestMapping("/hfPfpj")//回复用户评价
    public String hfPfpj(HttpServletRequest request, Gwc gwc){
        String gwcid = request.getParameter("gwcid");
        gwc.setId(Integer.parseInt(gwcid));
        int flag = gwcService.hfPfpj(gwc);
        if(flag == 1){
            request.setAttribute("message", "操作成功！");
            return "member/gd/pj";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/gd/pj";
        }
    }


    @RequestMapping("/delPj")
    public String delPj(HttpServletRequest request){
        String id = request.getParameter("id");
        Gwc gwc=new Gwc();
        gwc.setId(Integer.parseInt(id));
        gwc.setPf("暂无");
        gwc.setPj("暂无");
        int flag = gwcService.updateByPrimaryKeySelective(gwc);
        if(flag == 1){
            request.setAttribute("message", "操作成功！");
            return "admin/gd/pj";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/gd/pj";
        }
    }
}
