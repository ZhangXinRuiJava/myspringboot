package com.disney.springbase.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author zhanx503
 * @date 2019-05-28 14:58
 */
@ContextConfiguration(classes = {JavaConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
public class ProfileTest {

    @Autowired
    //@Resource(name="dev")
    private DemoBean demoBean;

    @Test
    public void testMy(){
        System.out.println(demoBean.getContent());
    }

}
