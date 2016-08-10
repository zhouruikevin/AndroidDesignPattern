package example.com.designpattern;

import org.junit.Test;

import example.com.designpattern.abstractfactory.AbstractProductA;
import example.com.designpattern.abstractfactory.FactoryImpl;

/**
 * Created by Administrator on 2016/8/10.
 */
public class AbstractFactoryTest {
    @Test
    public void testProductA() {
        AbstractProductA productA = new FactoryImpl().productA();
        productA.operation1();
        productA.operation2();
    }
}
