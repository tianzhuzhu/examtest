package exam.xiecheng;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.nio.file.OpenOption;
import java.util.Scanner;
import java.util.Stack;

public class xiecheng2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        int l=0,r=0;
        boolean right=true;
        Stack<StringBuilder> stack=new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='('){
                l++;
                stack.push(stringBuilder);
                stringBuilder=new StringBuilder();
                continue;
            }
            if(chars[i]==')')
            {
                r++;
                if(r>l) {
                    right = false;
                    break;
                }

                stringBuilder.reverse();
                stringBuilder = stack.pop().append(stringBuilder);

                continue;
            }
            stringBuilder.append(chars[i]);
        }
            if(l==r&&right==true)
                System.out.print(stringBuilder);
            else
                System.out.print("");

    }
//    (ab(ab)(ab(ba(ab)ba)ab)(ab)ab)
}
