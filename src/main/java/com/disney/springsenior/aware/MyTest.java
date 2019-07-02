package com.disney.springsenior.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author zhanx503
 * @date 2019-05-28 14:50
 */
@ContextConfiguration(classes = AwareConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

    @Resource(name="awareService")
    private AwareService awareService;

    @Test
    public void testMy() throws IOException {
        awareService.output();
    }

}
