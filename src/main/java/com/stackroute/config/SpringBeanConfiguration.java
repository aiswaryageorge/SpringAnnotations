package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanConfiguration {
   /* @Bean(name= "movie")
    public Movie getActor() {
        Actor actor = new Actor("Mohanlal", "Male", 49);
        return new Movie();
    }
    @Bean(name= "movie1")
    @Scope("prototype")
    public Movie getActor2() {
        Actor actor = new Actor("Anushka", "Female", 39);
        return new Movie(actor);
    }*/

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


}
