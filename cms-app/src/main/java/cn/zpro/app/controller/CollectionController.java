package cn.zpro.app.controller;

import cn.zpro.app.dao.ProcessMapper;
import cn.zpro.app.dto.OpenTables;
import cn.zpro.app.entity.Kaifu;
import cn.zpro.app.service.PiachService;
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

    @RequestMapping("process")
    @ResponseBody
    public String process() {

        //获取即将开服表的采集内容
        List<OpenTables> openTableJjkfList = piachService.findOpenTableJjkfList();
        for (OpenTables openTables : openTableJjkfList) {
            Kaifu kaifu = new Kaifu();
            kaifu.setArea(openTables.getArea());
            //10-04 00:00
            String openTime = openTables.getOpenTime();
            int mouth = Integer.parseInt(openTime.substring(0,2));
            int days = Integer.parseInt(openTime.substring(3,5));
            int hours = Integer.parseInt(openTime.substring(6,8));
            int min = Integer.parseInt(openTime.substring(9,11));
            Calendar calendar = Calendar.getInstance();
            calendar.set(2017, mouth-1, days,hours,min);
            kaifu.setCreateTime(calendar.getTime());
            kaifu.setTitle(openTables.getTitle());
            kaifu.setType(openTables.getType());
            processMapper.insert(kaifu);
        }
        return "采集处理完成";
    }

    public static void main(String[] args) {
    }
}
