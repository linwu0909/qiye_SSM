package lw.controller;

import lw.domain.SysLog;
import lw.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sysLog")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception{
        ModelAndView mv=new ModelAndView();
        List<SysLog> syslogList=sysLogService.findAll();
        mv.addObject("sysLogs",syslogList);
        mv.setViewName("syslog-list");
        return mv;
    }
}
