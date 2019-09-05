package exam.huawei;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class huawei082101 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        List<String> list=new ArrayList<>();
        for (int i = 1; i < s1.length; i++) {
            if(s1[i].equals("A")||s1[i].equals("a")) {
                list.add("12");
                list.add("34");
            }
            else if(s1[i].equals("B")||s1[i].equals("b")){
                list.add("AB");
                list.add("CD");
            }
            else
            {
                list.add(s1[i].toUpperCase());
            }
        }

        System.out.printf(Integer.toHexString(list.size()+1).toUpperCase());

        for (int i = 0; i < list.size(); i++) {
            System.out.printf(" "+list.get(i));
        }
    }
}
/**
 * @author ：mmzs
 * @date ：Created in 8/21 0021 19:04
 * @description：
 * @modified By：
 * @version: $
 */