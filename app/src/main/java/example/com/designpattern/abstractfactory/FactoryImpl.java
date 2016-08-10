package example.com.designpattern.abstractfactory;

/**
 * Created by Administrator on 2016/8/10.
 */
public class FactoryImpl implements AbstractFactory {
    public final static String TAG = "FactoryImpl";

    @Override
    public AbstractProductA productA() {
        return new AbstractProductA() {
            @Override
            public void operation1() {
                System.out.println(TAG + "--Inner Complete operation1");
            }

            @Override
            public void operation2() {
                System.out.println(TAG + "--Inner Complete operation2");
            }
        };
    }

    @Override
    public AbstractProductB productB() {
        return null;
    }
}
