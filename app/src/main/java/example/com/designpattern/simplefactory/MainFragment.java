package example.com.designpattern.simplefactory;

/**
 * Created by Administrator on 2016/8/10.
 */
public class MainFragment extends BaseFragment {
    public final static String TAG = "MainFragment";

    public MainFragment() {
        System.out.println(TAG + "--create");
    }

    @Override
    public void show() {
        System.out.println(TAG + "--show");
    }
}
