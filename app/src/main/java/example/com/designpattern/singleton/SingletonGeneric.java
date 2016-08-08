package example.com.designpattern.singleton;

/**
 * Created by Administrator on 2016/8/8.
 */
public abstract class SingletonGeneric<T> {
    private T sInstance;


    public T getInstance() {
        if (sInstance == null) {
            synchronized (this) {
                if (sInstance == null) {
                    sInstance = create();
                }
            }
        }
        return sInstance;
    }

    public abstract T create();

}
