package com.disney.springsenior.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * @author zhanx503
 * @date 2019-05-28 13:34
 */
@Service
@Conditional(OSXCondition.class)
public class OSXListService implements ListService {
    @Override
    public void showListCmd() {
        System.out.println("ls");
    }
}
