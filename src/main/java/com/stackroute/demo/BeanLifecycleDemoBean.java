package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
         System.out.println("initialising bean");
    }

    public void customInit(){
        System.out.println("initialising the bean using custom init");
    }
    public void customDestroy() {
        System.out.println("destroying the bean using custom destroy");
    }
}
