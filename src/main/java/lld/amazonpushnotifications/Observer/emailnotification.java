package lld.amazonpushnotifications.Observer;

import lld.amazonpushnotifications.Observable.iphoneObservable;

public class emailnotification implements NotificationObserver {
    String email;
    iphoneObservable iphoneobservable;

    public emailnotification(String email, iphoneObservable iphoneobservable) {
        this.email = email;
        this.iphoneobservable = iphoneobservable;
    }
    @Override
    public void update() {
        sendEmail(email, "in stock");
    }
    public void sendEmail(String email, String message) {
        System.out.println("Email sent to " + email + " with message: " + message);
    }
}
