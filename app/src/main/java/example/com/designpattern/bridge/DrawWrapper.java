package example.com.designpattern.bridge;

/**
 * Created by Administrator on 2016/8/10.
 */
public abstract class DrawWrapper {

    private Draw mDraw;

    protected DrawWrapper(Draw draw) {
        mDraw = draw;
    }

    protected void drawRectangle() {
        mDraw.drawRectangle();
    }

    protected void drawCircle() {
        mDraw.drawCircle();
    }

    public abstract void draw();
}
