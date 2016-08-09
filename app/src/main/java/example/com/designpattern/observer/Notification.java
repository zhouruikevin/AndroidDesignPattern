package example.com.designpattern.observer;

/**
 * Created by Administrator on 2016/8/9.
 */
public class Notification {
    private String mContent;

    public Notification(String content) {
        mContent = content;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "mContent='" + mContent + '\'' +
                '}';
    }
}
