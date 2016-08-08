package example.com.designpattern.singleton;

/**
 * Created by Administrator on 2016/8/8.
 */
public class SingletonLazy {
    private static SingletonLazy mInstance;

    private SingletonLazy() {
        //init...
    }

    public static SingletonLazy getInstance() {
        if (mInstance == null) {
            synchronized (SingletonLazy.class) {
                if (mInstance == null) {
                    mInstance = new SingletonLazy();
                }
            }
        }
        return mInstance;
    }
}
