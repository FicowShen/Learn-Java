package patterns.creational.singleton;

/***
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 */
public enum World {
    INSTANCE;

    private String name = "world";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
