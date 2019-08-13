package thread;

import java.util.concurrent.*;

public class MyFutureTask {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Object lock =new Object();
        Mycallable mycallable = new Mycallable(lock);
        Future<String> result = executor.submit(mycallable);

        Mycallable mycallable1= new Mycallable(lock);
        Future<String> result1 = executor.submit(mycallable1);

        Mycallable mycallable2 = new Mycallable(lock);
        Future<String> result2= executor.submit(mycallable2);

        executor.shutdown();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");

        try {
            System.out.println("task1运行结果"+result.get());
            System.out.println("task2运行结果"+result1.get());
            System.out.println("task3运行结果"+result2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }

}
/**
 * @author ：mmzs
 * @date ：Created in 2019/8/13 11:00
 * @description：
 * @modified By：
 * @version: $
 */