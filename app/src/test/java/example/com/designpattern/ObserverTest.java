package example.com.designpattern;

import org.junit.Test;

import java.util.concurrent.Executors;

import example.com.designpattern.observer.Notification;
import example.com.designpattern.observer.Observable;
import example.com.designpattern.observer.Observer;


/**
 * Created by Administrator on 2016/8/9.
 */
public class ObserverTest {
    @Test
    public void testObserver() {
        Observable<Notification> observable = new Observable<>();
        Observer<Notification> observer1 = new Observer<Notification>() {
            @Override
            public void onUpdate(Observable<Notification> observable, Notification notifation) {
                System.out.println("observer1:---" + notifation.getContent());
            }
        };
        Observer<Notification> observer2 = new Observer<Notification>() {
            @Override
            public void onUpdate(Observable<Notification> observable, Notification notifation) {
                System.out.println("observer2:---" + notifation.getContent());
            }
        };
        Notification n1 = new Notification("通知1");
        observable.notifyObservers(n1);
        observable.register(observer1);
        observable.register(observer2);
        Notification n2 = new Notification("Notification2");
        observable.notifyObservers(n2);
        observable.unRegister(observer1);
        Notification n3 = new Notification("Notification3");
        observable.notifyObservers(n3);
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    @Test
    public void testMultiThread() {
        final Observable<Notification> observable = new Observable<>();
        Observer<Notification> observer1 = new Observer<Notification>() {
            @Override
            public void onUpdate(Observable<Notification> observable, final Notification notifation) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("observer1:---" + notifation.getContent());
                        System.out.println("Thread:" + Thread.currentThread().getId());
                    }
                }).start();
            }
        };
        final Notification notification = new Notification("new thread notification!");
        observable.register(observer1);
        System.out.println("Thread:" + Thread.currentThread().getId());
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                observable.notifyObservers(notification);
                System.out.println("Thread:" + Thread.currentThread().getId());
            }
        });
    }
}
