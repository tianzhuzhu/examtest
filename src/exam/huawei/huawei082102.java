package exam.huawei;

import java.util.*;

public class huawei082102 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        List<String[]> list =new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(scanner.nextLine().split(","));
        }
        HashMap<String,Set<Integer>> hashMap=new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length; j++) {
                if(hashMap.get(list.get(i)[j])==null)
                    hashMap.put(list.get(i)[j],new HashSet<Integer>());
                hashMap.get(list.get(i)[j]).add(i);
            }
        }
        Set<Integer> isRead=new HashSet<>();
        Integer lastIsRead=0;
        Set<Integer> integers = hashMap.get(name);
        Set<Integer> total = hashMap.get(name);
        Set<String> nameSet=new HashSet<String>();
        while(integers!=null&&integers.size()!=0){
            Set<Integer> integers2 = new HashSet<>();
            Set<Integer> hashset=new HashSet<>();
            for (Integer integer2 : integers) {
                hashset.add(integer2);
                Iterator<Map.Entry<String, Set<Integer>>> iterator = hashMap.entrySet().iterator();
                while(iterator.hasNext()){
                    Set<Integer> value = iterator.next().getValue();
                    for (Integer integer : value) {
                        if(value.contains(integer2)&&!isRead.contains(integer)){
                            integers2.add(integer);

                        }
                    }
                }
                isRead.addAll(hashset);
                integers=integers2;
                total.addAll(integers2);
            }
            }

        for (int i = 0; i < total.size(); i++) {
            nameSet.addAll(Arrays.asList(list.get(i)));
        }
        System.out.printf(nameSet.size()+"");

    }
}
/**
 * @author ：mmzs
 * @date ：Created in 8/21 0021 19:04
 * @description：
 * @modified By：
 * @version: $
 */
