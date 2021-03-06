package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanConfiguration {

    @Bean(name= "movie")
    public Movie getActor() {
        Actor actor = new Actor("Mohanlal", "Male", 49);
        return new Movie(actor);
    }


    public Actor getAct() {
        Actor actor=new Actor();
        actor.setActorName("Anushka");
        actor.setActorGender("female");
        actor.setActorAge(49);
        return actor;
    }
    @Bean(name= "movie1")
    public Movie getActor1() {
        return new Movie(getAct());
    }


}
