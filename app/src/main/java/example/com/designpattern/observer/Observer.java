package example.com.designpattern.observer;

/**
 * Created by Administrator on 2016/8/9.
 */
public interface Observer<T> {
    void onUpdate(Observable<T> observable, T t);
}
