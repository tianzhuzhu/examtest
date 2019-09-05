package exam.xiecheng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class xiecheng3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int m = Integer.parseInt(s1[0]);
        int n = Integer.parseInt(s1[1]);
         s = scanner.nextLine();
        String[] s2 = s.split(" ");
        Integer[] integers=new Integer[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
          integers[i]=Integer.parseInt(s2[i]);
          sum+=integers[i];
        }
        System.out.println(halfSearch(integers,m,0,sum)+"");
    }

    private static int  halfSearch(Integer[] integers, int m, int left, int right) {

        if(left==right)
        {
            return left;
        }
        int mid =(left+right)/2;
        int rest=m;
        int i=0,s=0;
        while(rest>0)
        {
            int ton=mid;
            while(ton>=0){
                ton-=integers[i];
                i++;
                if(i==integers.length&&ton>=0)
                  return  halfSearch(integers,m,left,mid);
            }
            i--;
            rest--;
        }
        return halfSearch(integers, m, mid+1, right);

    }
//2 4
//1 2 3 4


}
