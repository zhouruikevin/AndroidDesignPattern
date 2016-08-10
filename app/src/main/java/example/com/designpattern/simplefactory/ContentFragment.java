package example.com.designpattern.simplefactory;

/**
 * Created by Administrator on 2016/8/10.
 */
public class ContentFragment extends BaseFragment {

    public final static String TAG = "ContentFragment";

    public ContentFragment() {
        System.out.println(TAG + "--create..");
    }

    @Override
    public void show() {
        System.out.println(TAG + "--show...");
    }
}
