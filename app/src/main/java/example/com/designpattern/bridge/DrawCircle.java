package example.com.designpattern.bridge;

/**
 * Created by Administrator on 2016/8/10.
 */
public class DrawCircle extends DrawWrapper {
    public DrawCircle(Draw draw) {
        super(draw);
    }

    @Override
    public void draw() {
        drawCircle();
    }
}
