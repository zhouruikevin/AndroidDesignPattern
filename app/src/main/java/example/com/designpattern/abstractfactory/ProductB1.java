package example.com.designpattern.abstractfactory;

/**
 * Created by Administrator on 2016/8/10.
 */
public class ProductB1 implements AbstractProductB {
    public final static String TAG = "ProductB1";

    @Override
    public void oper1() {
        System.out.println(TAG + ": oper1");
    }

    @Override
    public void oper2() {
        System.out.println(TAG + ": oper2");
    }
}
