package thread;

public class Myrunabble implements Runnable {

    static int i=0;

    Object lock=null;

    public Myrunabble(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf(i+" ");
    }

    public static void main(String[] args) {
        Object o = new Object();

        Myrunabble myrunabble1=new Myrunabble(o);
        Myrunabble myrunabble2=new Myrunabble(o);
        Myrunabble myrunabble3=new Myrunabble(o);
        myrunabble1.run();
        myrunabble2.run();
        myrunabble3.run();
    }
}
/**
 * @author ：mmzs
 * @date ：Created in 2019/8/13 11:25
 * @description：
 * @modified By：
 * @version: $
 */