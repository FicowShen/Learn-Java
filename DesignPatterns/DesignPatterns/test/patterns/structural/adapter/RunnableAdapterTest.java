package patterns.structural.adapter;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class RunnableAdapterTest {

    @Test
    void testAdapter() throws Exception {
        // https://stackoverflow.com/a/13684524
        ExecutorService pool = Executors.newFixedThreadPool(1);
        Callable<Long> callable = new Task(10000L);
        Future<Long> future = pool.submit(callable);
        Long result = future.get();
        assertEquals(50005000, result);
    }
}