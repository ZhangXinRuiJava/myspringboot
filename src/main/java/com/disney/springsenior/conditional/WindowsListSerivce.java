package com.disney.springsenior.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * @author zhanx503
 * @date 2019-05-28 13:33
 */
@Service
@Conditional(WindowsCondition.class)
public class WindowsListSerivce implements ListService {
    @Override
    public void showListCmd() {
        System.out.println("dir");
    }
}
