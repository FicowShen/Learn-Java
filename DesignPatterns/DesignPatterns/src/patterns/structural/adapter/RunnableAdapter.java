package patterns.structural.adapter;

import java.util.concurrent.Callable;

/***
 * 将一个类的接口转换成客户希望的另外一个接口，
 * 使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 */
public class RunnableAdapter implements Runnable {
    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable) {
        this.callable = callable;
    }

    @Override
    public void run() {
        try {
            callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
