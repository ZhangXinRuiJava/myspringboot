package com.disney.springsenior.taskscheduler;


import com.disney.springsenior.taskexecutor.TaskExecutorConfig;
import com.disney.springsenior.taskexecutor.TaskService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MainClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
    }

    @Test
    public void testJavaConfig() throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
        int i = 0;
        //context.close();
    }

}
