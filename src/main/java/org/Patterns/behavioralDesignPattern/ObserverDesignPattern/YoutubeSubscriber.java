package org.Patterns.behavioralDesignPattern.ObserverDesignPattern;

public class YoutubeSubscriber implements Subscriber {
    private String name;
    public YoutubeSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update(String video){
        System.out.println(name+" is watching video"+video);
    }
}
