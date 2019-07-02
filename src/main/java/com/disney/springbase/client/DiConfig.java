package com.disney.springbase.client;

import com.disney.springbase.service.FunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.disney.springbase")
public class DiConfig {

  @Bean
  public FunctionService functionService(){
      return new FunctionService();
  }

}
