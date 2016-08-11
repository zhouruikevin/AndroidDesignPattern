package example.com.designpattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import example.com.designpattern.templatemethod.MyActivity;
import example.com.designpattern.templatemethod.MyActivityThread;

/**
 * Created by Administrator on 2016/8/11.
 */
public class TemplateMothedTest {
    MyActivityThread mActivityThread;

    @Before
    public void initTest() {
        mActivityThread = new MyActivityThread(new MyActivity() {
            @Override
            protected void onCreate() {
                super.onCreate();
                System.out.println("TemplateMothedTest--onCreate: ");
            }

            @Override
            protected void onStart() {
                super.onStart();
            }
        });
    }

    @Test
    public void testHandleLauchActivity() {
        mActivityThread.handleLaunchActivity();
        System.out.println("TemplateMothedTest--testHandleLauchActivity: ");
    }

    @After
    public void initTestAfter() {
        mActivityThread = null;
    }
}
