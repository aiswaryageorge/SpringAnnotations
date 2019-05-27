package com.stackroute.config;

import awareInterface.ApplicationContextAwareDemo;
import awareInterface.BeanFactoryAwareDemo;
import awareInterface.BeanNameAwareDemo;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanConfiguration {

   @Bean(name = "actor")
       public Actor getAct() {
        Actor actor=new Actor();
        actor.setActorName("Anushka");
        actor.setActorGender("female");
        actor.setActorAge(49);
        return actor;}

    @Bean(name= "movie1")
    public Movie getMovie() {
        return new Movie();
    }

@Bean(name="applicationContextAwareDemo")
    public ApplicationContextAwareDemo getApplicationContextAwareDemo(){
       return  new ApplicationContextAwareDemo();
}

@Bean(name="beanFactoryAwareDemo")
    public BeanFactoryAwareDemo getBeanFactoryAwareDemo(){
       return new BeanFactoryAwareDemo();
}

@Bean(name="beanNameAwareDemo")
    public BeanNameAwareDemo getBeanNameAwareDemo(){
       return new BeanNameAwareDemo();
}

@Bean(name={"beanLifecycleDemoBean"}, initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean getBeanLifecycleDemoBean(){
       return new BeanLifecycleDemoBean();
}

}
