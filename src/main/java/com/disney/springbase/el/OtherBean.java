package com.disney.springbase.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author zhanx503
 * @date 2019-05-24 16:57
 */
@Service
public class OtherBean {

    @Value("另一个bean的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
