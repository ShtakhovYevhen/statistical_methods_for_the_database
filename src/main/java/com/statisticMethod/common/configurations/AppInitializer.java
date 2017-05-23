package com.statisticMethod.common.configurations;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ServletContext.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ApplicationContext.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
