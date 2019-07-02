package com.disney.springbase.aop;

import org.springframework.stereotype.Service;

/**
 * 被拦截类，方法式
 */
@Service
public class DemoMethodService {

   public void add(){
       System.out.println("DemoMethodService.add");
   }

}
