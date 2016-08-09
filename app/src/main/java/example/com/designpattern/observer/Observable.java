package example.com.designpattern.observer;


import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/9.
 */
public class Observable<T> {
    ArrayList<Observer<T>> mObservers = new ArrayList<>();

    public void register(Observer<T> observer) {
        if (observer == null) {
            throw new NullPointerException("observer is null");
        }
        synchronized (this) {
            if (!mObservers.contains(observer)) {
                mObservers.add(observer);
            }
        }
    }

    public synchronized void unRegister(Observer<T> observer) {
        mObservers.remove(observer);
    }

    public void notifyObservers(T t) {
        for (Observer<T> observer : mObservers) {
            observer.onUpdate(this, t);
        }
    }
}
