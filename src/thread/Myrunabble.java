package thread;

import java.util.Date;

public class Myrunabble implements Runnable {

    static int i=0;

    Object lock=null;


    @Override
    public synchronized void run() {
        this.walk();
//        System.out.println(" "+System.currentTimeMillis()%10000);
    }

        void walk()  {
          for (int j = 0; j <1000; j++) {
              i++;
              try {
                  Thread.sleep(1);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

          System.out.println(i+"");

    }
}
/**
 * @author ：mmzs
 * @date ：Created in 2019/8/13 11:25
 * @description：
 * @modified By：
 * @version: $
 */