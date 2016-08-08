package example.com.designpattern.singleton;

/**
 * Created by Administrator on 2016/8/8.
 */
public class SingletonInnerClass {

    private SingletonInnerClass() {
    }

    private static class SingletonHolder {
        private SingletonInnerClass mInstance;

        public SingletonHolder() {
            mInstance = new SingletonInnerClass();
        }

        public SingletonInnerClass getmInstance() {
            return mInstance;
        }

    }

    public static SingletonInnerClass getmInstance() {
        return new SingletonHolder().getmInstance();
    }
}
