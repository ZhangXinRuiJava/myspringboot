package com.disney.springsenior.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhanx503
 * @date 2019-05-28 11:08
 */
@Service
public class ScheduledTaskService {

    private DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    private void fixedRateExec(){
        System.out.println("每隔5秒执行一次："+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 25 11 ? * *")
    public void cronExec(){
        System.out.println("固定时间执行"+dateFormat.format(new Date()));
    }

}
