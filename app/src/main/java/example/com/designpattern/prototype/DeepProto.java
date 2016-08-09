package example.com.designpattern.prototype;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/9.
 */
public class DeepProto implements Cloneable {
    private String mName;
    private int mAge;
    private ArrayList<String> mDatas;

    public DeepProto(String name, int age, ArrayList<String> datas) {
        mName = name;
        mAge = age;
        mDatas = datas;
    }

    public DeepProto(DeepProto proto) {
        this.mAge = proto.mAge;
        this.mName = proto.mName;
        this.mDatas = (ArrayList<String>) proto.mDatas.clone();
    }

    @Override
    public Object clone() {
        return new DeepProto(this);
    }

    @Override
    public String toString() {
        return "DeepProto{" +
                "mName='" + mName + '\'' +
                ", mAge=" + mAge +
                ", mDatas=" + mDatas +
                '}';
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
}
