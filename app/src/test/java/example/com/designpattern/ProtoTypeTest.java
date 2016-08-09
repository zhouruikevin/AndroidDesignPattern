package example.com.designpattern;

import org.junit.Test;

import java.util.ArrayList;

import example.com.designpattern.prototype.DeepProto;
import example.com.designpattern.prototype.ShallowProto;

/**
 * Created by Administrator on 2016/8/9.
 */
public class ProtoTypeTest {
    @Test
    public void testShallowProto() {
        ArrayList<String> mDatas = new ArrayList<String>();
        mDatas.add("this");
        mDatas.add("is");
        mDatas.add("a");
        mDatas.add("shallow copy");
        ShallowProto shallowProto = new ShallowProto("zr", 27, mDatas);
        ShallowProto shallowCopy = (ShallowProto) shallowProto.clone();
        System.out.println(shallowProto);
        System.out.println(shallowCopy);

        shallowCopy.setName("tony boy");
        shallowCopy.setAge(10);
        mDatas.add("add tony boy!");
        System.out.println();
        System.out.println(shallowProto);
        System.out.println(shallowCopy);
    }

    @Test
    public void testDeepProto() {
        ArrayList<String> mDatas = new ArrayList<String>();
        mDatas.add("this");
        mDatas.add("deep");
        mDatas.add("copy");
        DeepProto deepProto = new DeepProto("deep", 100, mDatas);
        DeepProto deepCopy = (DeepProto) deepProto.clone();
        System.out.println(deepProto);
        System.out.println(deepCopy);
        deepCopy.setName("deepCopy");
        deepCopy.setAge(101);
        mDatas.add("come back");
        System.out.println();
        System.out.println(deepProto);
        System.out.println(deepCopy);
    }
}
