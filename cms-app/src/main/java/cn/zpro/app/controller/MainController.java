package cn.zpro.app.controller;

import cn.zpro.app.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
public class MainController {

    @Autowired
    private CmsService cmsService;

    @RequestMapping("index")
    public String index(){
        cmsService.test1();
        return "index";
    }
}
