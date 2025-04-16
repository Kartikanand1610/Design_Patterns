package org.Patterns.behavioralDesignPattern.ObserverDesignPattern;

public interface YoutubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
}
