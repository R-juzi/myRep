package com.git.rjc.javaEE;

public class NatureNumbers {
    /**
     * 两数之和 两数之差都是平方数
     * @param n
     * @param m
     * @return
     */
    public static boolean isNatureNumbers(int n, int m) {
        int loopNum1=n+m;
        for (int i = 0; i < loopNum1; i++) {
            //TODO 从1一直平方到<=num/2没有相等的就不是平方数 边界处理 0
        }
        double tmp1 = Math.sqrt(n + m);
        double tmp2 = Math.sqrt(Math.max(n, m) - Math.min(n, m));
        boolean result1 = (tmp1 == (int) tmp1);
        boolean result2 = (tmp2 == (int) tmp2);
        return (result1 && result2);
    }
    /**
     *
     */
    public static void PrintShadow(int maxNumber){

    }

    public static void main(String[] args) {
        System.out.println(NatureNumbers.isNatureNumbers(8,17));
        System.out.println(NatureNumbers.isNatureNumbers(0,4));
        System.out.println(NatureNumbers.isNatureNumbers(-1,17));
        System.out.println(NatureNumbers.isNatureNumbers(0,7));
    }
}
