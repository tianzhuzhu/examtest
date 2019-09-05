package exam.xiecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xiecheng1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        Integer[] ints =new Integer[s.length];
        for (int i = 0; i < s.length; i++) {
            ints[i]=Integer.parseInt(s[i]);
        }
        List<Integer> list =new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]<=value) {
                list.add(ints[i]);
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]>value) {
                list.add(ints[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i!=list.size()-1)
                System.out.print(",");
        }
    }
}
