package cn.zpro.app.controller;

import cn.zpro.app.dao.UserMapper;
import cn.zpro.app.dto.OpenTables;
import cn.zpro.app.entity.EcmsFlash;
import cn.zpro.app.service.CmsService;
import cn.zpro.app.service.PiachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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
        List<OpenTables> list = new ArrayList<>();
        List<OpenTables> openTableList = piachService.findOpenTableList();
        for (OpenTables openTables:openTableList) {
            String title = openTables.getTitle();
            EcmsFlash ecmsFlash = cmsService.getFlashByTitle(title);
            if(null != ecmsFlash){
                list.add(openTables);
            }
        }
        view.addObject("list",list);

        return view;
    }
    @RequestMapping("kaifu")
    public ModelAndView kaifu(ModelAndView view){

        view.setViewName("kaifu");
        return view;
    }
}
