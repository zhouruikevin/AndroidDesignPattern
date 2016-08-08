package example.com.designpattern.singleton;

/**
 * Created by Administrator on 2016/8/8.
 */
public class SingletonVolatile {
    private volatile static SingletonVolatile sInstance;

    private SingletonVolatile() {
        //init...
    }

    public static SingletonVolatile getInstance() {
        if (sInstance == null) {
            synchronized (SingletonVolatile.class) {
                if (sInstance == null) {
                    sInstance = new SingletonVolatile();
                }
            }
        }
        return sInstance;
    }
}
