package example.com.designpattern.templatemethod;

/**
 * Created by Administrator on 2016/8/11.
 */
public abstract class MyActivity {

    protected void onCreate() {
        System.out.println("MyActivity--onCreate: ");
    }

    protected void onRestoreInstanceState() {
        System.out.println("MyActivity--onRestoreInstanceState: ");
    }

    protected void onRestart() {
        System.out.println("MyActivity--onRestart: ");
    }

    protected void onStart() {
        System.out.println("MyActivity--onStart: ");
    }

    protected void onResume() {
        System.out.println("MyActivity--onResume: ");
    }

}
