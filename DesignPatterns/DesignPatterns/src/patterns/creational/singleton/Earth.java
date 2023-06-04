package patterns.creational.singleton;

/***
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 */
public class Earth {
    private static final Earth instance = new Earth();

    private String name = "earth";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Earth() {}

    public static Earth getInstance() { return instance; }
}
