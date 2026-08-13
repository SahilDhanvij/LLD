package lld.amazonpushnotifications.Observer;

import lld.amazonpushnotifications.Observable.iphoneObservable;

public class messagenotification implements NotificationObserver {
    String username;
    iphoneObservable iphoneobservable;

    public messagenotification(String username, iphoneObservable iphoneobservable) {
        this.username = username;
        this.iphoneobservable = iphoneobservable;
    }

    @Override
    public void update() {
        sendMessage(username, "in stock");
    }

    public void sendMessage(String username, String message) {
        System.out.println("Message sent to " + username + " with message: " + message);
    }
}
