package example.com.designpattern.builder;

import android.text.TextUtils;

/**
 * step 2:use Builder pattern retrofit NoBuilder class
 */
public class Builder {
    private int mAge;
    private String mName;

    public NoBuilder build() {
        if (mAge <= 0) {
            throw new IllegalArgumentException("age not set!");
        }
        if (TextUtils.isEmpty(mName)) {
            throw new IllegalArgumentException("name set error!");
        }
        NoBuilder noBuilder = new NoBuilder();
        noBuilder.setAge(mAge);
        noBuilder.setName(mName);
        return noBuilder;
    }

    public int getAge() {
        return mAge;
    }

    public Builder setAge(int age) {
        mAge = age;
        return this;
    }

    public String getName() {
        return mName;
    }

    public Builder setName(String name) {
        mName = name;
        return this;
    }

    public void test() {
        NoBuilder model = new Builder().setAge(27).setName("zr").build();
        //equal
        new Builder().setName("zr").setAge(27).build();
    }
}
