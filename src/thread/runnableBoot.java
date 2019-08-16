package thread;

public class runnableBoot {
    public static void main(String[] args) {
        Myrunabble myrunabble1=new Myrunabble();
        Myrunabble myrunabble2=new Myrunabble();
        Myrunabble myrunabble3=new Myrunabble();
       new Thread(myrunabble1).start();
       new Thread(myrunabble2).start();
       new Thread(myrunabble3).start();

    }
}
/**
 * @author ：mmzs
 * @date ：Created in 2019/8/13 15:18
 * @description：
 * @modified By：
 * @version: $
 */