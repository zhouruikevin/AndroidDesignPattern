package example.com.designpattern.singleton;

/**
 * Created by Administrator on 2016/8/8.
 */
public class SingleInstance implements IActivityManager {
    private String name;
    private String key;
    private int age;

    public SingleInstance(String name, String key, int age) {
        this.name = name;
        this.key = key;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
