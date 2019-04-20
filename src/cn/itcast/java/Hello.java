package cn.itcast.java;

import java.util.LinkedHashMap;

/**
 * @author lmx
 * @date 2019/4/20--17:58
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("123");
        int m=10;
        System.out.println("m = " + m);
        int[] arr={1,32,4,5,3,2,5,6,3};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (int num : arr) {
            System.out.println(num);
        }
        for (int s = 0; s < arr.length; s++) {
            int v = arr[s];
            System.out.println("v = " + v);
        }
        System.out.println();
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("abc",1);
        System.out.println(linkedHashMap);

    }
}
