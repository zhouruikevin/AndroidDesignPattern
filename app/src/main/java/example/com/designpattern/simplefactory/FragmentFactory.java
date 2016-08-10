package example.com.designpattern.simplefactory;

import android.graphics.BitmapFactory;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/10.
 */
public class FragmentFactory {

    public final static String TAG = "FragmentFactory";
    public static Map<String, BaseFragment> mFragmentMap = new HashMap<>();

    public static BaseFragment getFragment(String fragmentTag) {
        BaseFragment fragment = mFragmentMap.get(fragmentTag);

        if (fragment == null) {
            switch (fragmentTag) {
                case ContentFragment.TAG:
                    fragment = new ContentFragment();
                    break;
                case MainFragment.TAG:
                    fragment = new MainFragment();
                    break;
                default:
                    fragment = new MainFragment();
                    break;
            }
            mFragmentMap.put(fragmentTag, fragment);
        }
        return fragment;
    }

    public static void fragmentRecycle(String fragmentTag) {
        if (TextUtils.isEmpty(fragmentTag)) {
            return;
        }
        mFragmentMap.remove(fragmentTag);
    }
}
