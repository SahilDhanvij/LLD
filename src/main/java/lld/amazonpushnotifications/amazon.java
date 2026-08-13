package lld.amazonpushnotifications;

import lld.amazonpushnotifications.Observable.iphoneObservable;
import lld.amazonpushnotifications.Observable.iphoneobservableImp;
import lld.amazonpushnotifications.Observer.NotificationObserver;
import lld.amazonpushnotifications.Observer.emailnotification;
import lld.amazonpushnotifications.Observer.messagenotification;

public class amazon {
    public static void main(String[] args) {
        iphoneObservable iphoneObservable = new iphoneobservableImp(); 
        NotificationObserver observer1 = new emailnotification("xyz@gmail.com", iphoneObservable);
        NotificationObserver observer2 = new emailnotification("abc@gmail.com", iphoneObservable);
        NotificationObserver observer3 = new messagenotification("abc", iphoneObservable);

        iphoneObservable.addObserver(observer1);
        iphoneObservable.addObserver(observer2);
        iphoneObservable.addObserver(observer3);

        iphoneObservable.setData(10);
        iphoneObservable.setData(0);
        iphoneObservable.setData(5);        

    }
}
