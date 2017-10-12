package cn.zpro.app.service;

import cn.zpro.app.dao.ProcessMapper;
import cn.zpro.app.dto.OpenTables;
import cn.zpro.app.entity.Kaifu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;

/**
 * 定时任务
 */
@Component
public class ScheduledService {

    @Autowired
    private ProcessMapper processMapper;
    @Autowired
    private PiachService piachService;

    /**
     * 每天上午9:15 触发
     */
    @Scheduled(cron = "0 15 9 ? * *")
    public void executeTask() {
        doProcess();
    }

    private void doProcess() {
        List<OpenTables> openTableJjkfList = piachService.findOpenTableJjkfList();
        for (OpenTables openTables : openTableJjkfList) {
            Kaifu kaifu = new Kaifu();
            kaifu.setArea(openTables.getArea());
            String openTime = openTables.getOpenTime();
            int mouth = Integer.parseInt(openTime.substring(0, 2));
            int days = Integer.parseInt(openTime.substring(3, 5));
            int hours = Integer.parseInt(openTime.substring(6, 8));
            int min = Integer.parseInt(openTime.substring(9, 11));
            Calendar calendar = Calendar.getInstance();
            calendar.set(2017, mouth - 1, days, hours, min);
            kaifu.setCreateTime(calendar.getTime());
            kaifu.setTitle(openTables.getTitle());
            kaifu.setType(openTables.getType());
            processMapper.insert(kaifu);
        }
    }
}
