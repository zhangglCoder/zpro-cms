package cn.zpro.app.controller;

import cn.zpro.app.dao.UserMapper;
import cn.zpro.app.dto.OpenTables;
import cn.zpro.app.entity.EcmsFlash;
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
    private PiachService piachService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("kaifu")
    public ModelAndView index(ModelAndView view){
        view.setViewName("kaifu");
        List<OpenTables> todayList = userMapper.getTodayList();
        List<OpenTables> comingList = userMapper.getComingList();
        view.addObject("todayList",todayList);
        view.addObject("comingList",comingList);
        return view;
    }
    @RequestMapping("kaifu_info")
    public ModelAndView kaifu(ModelAndView view,String title){
        System.out.println(title);
        List<OpenTables> todayListByTitle = userMapper.getTodayListByTitle(title);
        List<OpenTables> comingListByTitle = userMapper.getComingListByTitle(title);
        view.addObject("todayList",todayListByTitle);
        view.addObject("comingList",comingListByTitle);
        view.setViewName("kaifu_info");
        return view;
    }
}
