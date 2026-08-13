package lld.amazonpushnotifications.Observable;

import java.util.ArrayList;
import java.util.List;

import lld.amazonpushnotifications.Observer.NotificationObserver;

public class iphoneobservableImp implements iphoneObservable {
    public List<NotificationObserver> observerList= new ArrayList<>();
    public int data = 0;

    @Override
    public void addObserver(NotificationObserver observer) {
        observerList.add(observer);
    }
    public void removeObserver(NotificationObserver observer) {
        observerList.remove(observer);
    }
    public void notifyObservers() {
        for(NotificationObserver observer: observerList) {
            observer.update();
        }
    }
    public void setData(int newdata) {
        boolean wasoutofstock = (data == 0);
        //random business logic
        data = newdata;
        if( wasoutofstock && data > 0){
            notifyObservers();
        }
    }
    public int getData() {
        return data;
    }

}