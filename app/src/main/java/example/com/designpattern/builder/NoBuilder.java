package example.com.designpattern.builder;

/**
 * step 1:if not use builder pattern
 */
public class NoBuilder {
    private String mName;
    private int mAge;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = "name:" + name + ",age:" + mAge;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public void test() {
        NoBuilder noBuilder = new NoBuilder();
        noBuilder.setAge(27);
        noBuilder.setName("zr");
        //not equal
        noBuilder.setName("zr");
        noBuilder.setAge(27);
    }
}
