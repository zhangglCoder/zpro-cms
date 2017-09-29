package cn.zpro.app.controller;

import cn.zpro.app.dao.UserMapper;
import cn.zpro.app.service.CmsService;
import cn.zpro.app.service.PiachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("main")
public class MainController {

    @Autowired
    private CmsService cmsService;

    @Autowired
    private PiachService piachService;

    @RequestMapping("index")
    public ModelAndView index(ModelAndView view){
        view.setViewName("index");
        //view.addObject("list",cmsService.findList());
        view.addObject("list",piachService.findOpenTableList());

        return view;
    }
}
