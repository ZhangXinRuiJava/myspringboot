package com.disney.springsenior.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Spring Aware的目的是让bean获得Spring容器服务
 * @author zhanx503
 * @date 2019-05-28 09:59
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String s;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.s = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void output() throws IOException {
        System.out.println("bean的名称："+s);
        Resource resource = resourceLoader.getResource("classpath:tes.txt");
        InputStream inputStream = resource.getInputStream();
        System.out.println(IOUtils.toString(inputStream, Charset.forName("utf-8")));
    }

}
