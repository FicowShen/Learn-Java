package patterns.structural.bridge;

/***
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 */
public abstract class Car {

    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
