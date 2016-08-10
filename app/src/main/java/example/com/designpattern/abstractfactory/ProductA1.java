package example.com.designpattern.abstractfactory;

import android.nfc.Tag;

/**
 * Created by Administrator on 2016/8/10.
 */
public class ProductA1 implements AbstractProductA {

    public final static String TAG = "ProductA1";

    @Override
    public void operation1() {
        System.out.println(TAG + ": operation1");
    }

    @Override
    public void operation2() {
        System.out.println(TAG + ": operation1");
    }
}
