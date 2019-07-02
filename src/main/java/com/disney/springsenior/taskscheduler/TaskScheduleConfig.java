package com.disney.springsenior.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zhanx503
 * @date 2019-05-28 10:34
 */
@Configuration
@ComponentScan("com.disney.springsenior.taskscheduler")
@EnableScheduling
public class TaskScheduleConfig {
}
