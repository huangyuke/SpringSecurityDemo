package com.baosight.security.springMvc.init;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    public SpringSecurityApplicationInitializer() {
        //super(WebSecurityConfig.class); (当前环境未使用Spring环境或SpringMvc时需要添加该句)
    }
}
