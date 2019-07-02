package com.disney.springbase.config;

import com.disney.springbase.config.FunctionService;

public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}
