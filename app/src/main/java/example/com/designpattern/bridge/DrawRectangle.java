package example.com.designpattern.bridge;

/**
 * Created by Administrator on 2016/8/10.
 */
public class DrawRectangle extends DrawWrapper {
    public DrawRectangle(Draw draw) {
        super(draw);
    }

    @Override
    public void draw() {
        drawRectangle();
    }
}
