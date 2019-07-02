package com.disney.springsenior.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 任务
 * @author zhanx503
 * @date 2019-05-28 10:37
 */
@Service
public class TaskService {

    @Async
    public void execTask(Integer i){
        System.out.println("执行任务 "+i);
    }

    @Async
    public void execTaskPlus(Integer i){
        System.out.println("执行任务Plus "+(i+1));
    }

}
