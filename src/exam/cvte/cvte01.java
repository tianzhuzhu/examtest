package exam.cvte;

import java.util.ArrayList;
import java.util.List;

public class cvte01 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(100);
        }
        for (int i = 0; i < 200; i++) {
            double random = Math.random();
            int eat = (int) Math.floor(random * list.size());
            if(list2.contains(list.get(eat)))
                list.remove(list.get(eat));
            else
                list2.add(list.get(eat));
            System.out.printf("Day"+i +"Pill"+eat);
        }
    }
}
/**
 * @author ：mmzs
 * @date ：Created in 8/30 0030 19:08
 * @description：
 * @modified By：
 * @version: $
 */