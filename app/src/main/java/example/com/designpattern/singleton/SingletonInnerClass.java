package example.com.designpattern.singleton;

/**
 * Created by Administrator on 2016/8/8.
 */
public class SingletonInnerClass {

    private SingletonInnerClass() {
    }

    private static class SingletonHolder {
        private static SingletonInnerClass mInstance = new SingletonInnerClass();
    }

    public static SingletonInnerClass getmInstance() {
        return SingletonHolder.mInstance;
    }
}
