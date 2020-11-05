package com.git.rjc.javaEE;

import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int key:arr) {
            System.out.println(key);
        }
//        Arrays.fill(arr, 1);
        Arrays.asList(arr).forEach(one-> System.out.println(one));//用这种方法数组的类型必须是integer？？？
    }
}
