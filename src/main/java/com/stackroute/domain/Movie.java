package com.stackroute.domain;

public class Movie {
   private Actor actor;

    public Movie() {
        System.out.println("Constructor");
    }
    public Movie(Actor actor) {
        this.actor=actor;
    }

    @Override
    public String toString() {
        return "Movie{" + "actor=" + actor + '}';
    }
}
