package com.disney.springsenior.taskexecutor;


import com.disney.springsenior.aware.AwareConfig;
import com.disney.springsenior.aware.AwareService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MainClient {

    @Test
    public void testJavaConfig() throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        TaskService taskService = context.getBean(TaskService.class);

        for(int i=0;i<5;i++){
            taskService.execTask(i);
            taskService.execTaskPlus(i);
        }

        context.close();
    }

}
