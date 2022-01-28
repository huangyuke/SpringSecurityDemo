package com.baosight.security.springMvc.init;

import com.baosight.security.springMvc.config.ApplicationConfig;
import com.baosight.security.springMvc.config.WebConfig;
import com.baosight.security.springMvc.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //Spring容器,相当于加载applicationContext.xml
    @Override
    protected Class<? >[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class, WebSecurityConfig.class};
    }

    //servletContext,相当于加载springmvc.xml
    @Override
    protected Class<? >[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    //url-mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
