package lld.amazonpushnotifications.Observable;

import lld.amazonpushnotifications.Observer.NotificationObserver;

public interface iphoneObservable {
    public void addObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers();
    public void setData(int newdata);
    public int getData();
}
