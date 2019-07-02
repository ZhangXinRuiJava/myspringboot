package com.disney.springbase.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author zhanx503
 * @date 2019-05-24 15:34
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
