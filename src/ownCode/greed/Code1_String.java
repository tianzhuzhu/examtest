package ownCode.greed;

import java.util.Arrays;

public class Code1_String {
    public static void main(String[] args) {
        String[] str={"ab","bd","abc","bcd","ac"};
        Arrays.sort(str, (a, b)->{
            return (a+b).compareTo(b+a);
        });
        System.out.println(Arrays.toString(str));
    }
}
