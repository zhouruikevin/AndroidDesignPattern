package example.com.designpattern.templatemethod;

/**
 * Created by Administrator on 2016/8/11.
 */
public class MyActivityThread {
    MyActivity mMyActivity;

    public MyActivityThread(MyActivity myActivity) {
        mMyActivity = myActivity;
    }

    public void handleLaunchActivity() {
        mMyActivity.onCreate();
        mMyActivity.onRestoreInstanceState();
        mMyActivity.onRestart();
        mMyActivity.onStart();
        mMyActivity.onResume();
    }
}
