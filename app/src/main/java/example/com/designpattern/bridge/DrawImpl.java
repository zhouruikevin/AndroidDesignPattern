package example.com.designpattern.bridge;

/**
 * Created by Administrator on 2016/8/10.
 */
public class DrawImpl implements Draw {
    private Dp1 mDp1;

    public DrawImpl() {
        mDp1 = new Dp1();
    }

    @Override
    public void drawRectangle() {
        mDp1.drawRectangleByDp1();
    }

    @Override
    public void drawCircle() {
        mDp1.drawCircleByDp1();
    }
}
