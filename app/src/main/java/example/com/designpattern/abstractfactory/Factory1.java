package example.com.designpattern.abstractfactory;

/**
 * Created by Administrator on 2016/8/10.
 */
public class Factory1 implements AbstractFactory {
    @Override
    public AbstractProductA productA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB productB() {
        return new ProductB1();
    }
}
