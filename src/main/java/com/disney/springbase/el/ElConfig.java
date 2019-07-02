package com.disney.springbase.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author zhanx503
 * @date 2019-05-24 17:02
 */
@Service
@PropertySource(value="classpath:test.properties",encoding = "UTF-8")
public class ElConfig {

    @Value("普通属性")  //注入普通字符串
    private String normal;

    @Value("#{systemProperties['os.name']}")  //注入操作系统属性
    private String osName;

    @Value("#{T(java.lang.Math).random()*100}")  //注入表达式结果
    private double randomNum;

    @Value("classpath:test.txt") //注入文件资源
    private Resource testFile;

    @Value("https://www.baidu.com/") //注入网络资源
    private Resource testUrl;

    @Value("${book.name}")  //注入配置文件
    private String bookName;

    @Autowired
    private Environment environment;

    @Value("#{otherBean.another}")  //注入另一个bean属性值，有问题
    private String fromOther;

    @Override
    public String toString() {
        String res = "";
        try {
             res = "ElConfig{" +
                    "normal='" + normal + '\'' +
                    ", osName='" + osName + '\'' +
                    ", randomNum=" + randomNum + '\'' +
                    ", testFile=" + IOUtils.toString(testFile.getInputStream()) +
                    ", testUrl=" + IOUtils.toString(testUrl.getInputStream()) +
                    ", bookName=" + bookName +
                    ", environment.book.author=" + environment.getProperty("book.author") +
                    ", fromOther=" + fromOther +
                    '}';
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
