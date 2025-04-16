package org.Patterns.behavioralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel{
    private List<Subscriber> subscribers = new ArrayList<>(); // List of subscribers
    private String video;
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber:subscribers){
            subscriber.update(video);
        }
    }
    public void uploadNewVideo(String video){
        this.video=video;
        notifySubscribers();
    }
}
