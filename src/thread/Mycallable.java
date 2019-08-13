package thread;


import java.util.concurrent.Callable;

public class Mycallable implements Callable<String> {

    static String a ="";
//    static Integer i=1;
      Object lock =null;

    public Mycallable(Object lock) {
        this.lock = lock;
    }

    @Override
    public String call() throws Exception {

        synchronized (lock) {
            while(lock==null){
                ;
            }
            a+= Math.random()+"";
            Thread.sleep(3000);
//            notify();
            return a;
        }
    }
}
/**
 * @author ：mmzs
 * @date ：Created in 2019/8/13 11:00
 * @description：
 * @modified By：
 * @version: $
 */