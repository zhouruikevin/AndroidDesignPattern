package example.com.designpattern.bridge;

/**
 * Created by Administrator on 2016/8/10.
 */
public class DrawImpl2 implements Draw {
    private Dp2 mDp2;

    public DrawImpl2() {
        mDp2 = new Dp2();
    }

    @Override
    public void drawCircle() {
        mDp2.drawCircleByDp2();
    }

    @Override
    public void drawRectangle() {
        mDp2.drawRectangleByDp2();
    }
}
