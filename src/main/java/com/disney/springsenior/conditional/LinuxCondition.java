package com.disney.springsenior.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 条件，判断是否为linux
 * @author zhanx503
 * @date 2019-05-28 11:58
 */
public class LinuxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean flag = context.getEnvironment().getProperty("os.name").contains("Linux");
        return flag;
    }
}
