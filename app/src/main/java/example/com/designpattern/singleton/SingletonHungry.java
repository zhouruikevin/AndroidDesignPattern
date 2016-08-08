package example.com.designpattern.singleton;

/**
 * Created by Administrator on 2016/8/8.
 */
public class SingletonHungry {
    private static SingletonHungry mInstance = new SingletonHungry();

    private  SingletonHungry() {
    }

    public static SingletonHungry getmInstance() {
        return mInstance;
    }
}
