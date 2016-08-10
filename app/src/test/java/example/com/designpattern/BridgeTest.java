package example.com.designpattern;

import org.junit.After;
import org.junit.Test;

import example.com.designpattern.bridge.DrawCircle;
import example.com.designpattern.bridge.DrawImpl;
import example.com.designpattern.bridge.DrawImpl2;
import example.com.designpattern.bridge.DrawRectangle;
import example.com.designpattern.bridge.DrawWrapper;

/**
 * Created by Administrator on 2016/8/10.
 */
public class BridgeTest {

    private DrawWrapper mDrawWrapper;

    @Test
    public void testDrawRectangle() {
        mDrawWrapper = new DrawRectangle(new DrawImpl2());
        mDrawWrapper.draw();
    }

    @Test
    public void testDrawCircleByDp2() {
        mDrawWrapper = new DrawCircle(new DrawImpl2());
        mDrawWrapper.draw();
    }

    @After
    public void init() {
        mDrawWrapper = null;
    }
}
