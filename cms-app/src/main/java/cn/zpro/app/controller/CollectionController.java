package cn.zpro.app.controller;

import cn.zpro.app.dao.ProcessMapper;
import cn.zpro.app.dto.OpenTables;
import cn.zpro.app.entity.Kaifu;
import cn.zpro.app.service.PiachService;
import cn.zpro.app.service.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 用于处理采集
 */
@RequestMapping("c")
@Controller
public class CollectionController {

    @Autowired
    private PiachService piachService;
    @Autowired
    private ProcessMapper processMapper;

    @Autowired
    private ScheduledService scheduledService;

    @RequestMapping("process")
    @ResponseBody
    public String process() {
        //获取即将开服表的采集内容
        scheduledService.executeTask();
        return "采集处理完成";
    }
}
