package com.disney.springbase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

  @Bean
  public FunctionService getFunctionService(){//functionService
      return new FunctionService();
  }

  /*@Bean
  public UseFunctionService getUseFunctionService(){//useFunctionService
      UseFunctionService useFunctionService = new UseFunctionService();
      useFunctionService.setFunctionService(getFunctionService());
      return useFunctionService;
  }*/

    @Bean
    public UseFunctionService getUseFunctionService(FunctionService functionService){//useFunctionService
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }

}
