package example.com.designpattern.prototype;

import java.util.ArrayList;

/**
 * just test shallow copy
 */
public class ShallowProto implements Cloneable {
    private String mName;
    private int mAge;
    private ArrayList<String> mDatas;

    public ShallowProto(String name, int age, ArrayList<String> datas) {
        mName = name;
        mAge = age;
        mDatas = datas;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public ArrayList<String> getDatas() {
        return mDatas;
    }

    public void setDatas(ArrayList<String> datas) {
        mDatas = datas;
    }

    @Override
    public String toString() {
        return "ShallowProto{" +
                "mName='" + mName + '\'' +
                ", mAge=" + mAge +
                ", mDatas=" + mDatas +
                '}';
    }

    public ShallowProto(ShallowProto proto) {
        this.mAge = proto.mAge;
        this.mName = proto.mName;
        this.mDatas = proto.mDatas;
    }

    @Override
    public Object clone() {
        return new ShallowProto(this);
    }
}
