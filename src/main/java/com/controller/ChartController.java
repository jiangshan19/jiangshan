package com.controller;

import com.bean.ComBean;
import com.pojo.Chart;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/chart")
public class ChartController {

    @RequestMapping("/showchart")
    public void showChart(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String member=(String)session.getAttribute("member");
        ComBean cBean = new ComBean();
        String ksj = request.getParameter("ksj");
        String esj = request.getParameter("esj");
        List<Chart> chartlist =new ArrayList<Chart>();//SELECT sum(zj),sj from dd group by sj order by sj asc
        String sql="select sum(zj),sj from dd where sj>='"+ksj+"' and sj<='"+esj+"' and gys='"+member+"' group by sj order by sj asc";
        List swlist =cBean.getCom(sql,2);
        if(!swlist.isEmpty()){
            for(int i=0;i<swlist.size();i++){
                List list2=(List)swlist.get(i);
                Chart chart=new Chart();
                chart.setTime(list2.get(1).toString().substring(0,10));
                chart.setSumCount(Float.parseFloat(list2.get(0).toString()));
                chart.setIpCount((i+1)*100);
                chartlist.add(chart);
            }
            JSONObject param=new JSONObject();
            JSONArray json = JSONArray.fromObject(chartlist);
            param.put("RowCount", chartlist.size());
            param.put("Rows", json);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.println(param.toString());
            out.flush();
            out.close();
        }
    }
}
