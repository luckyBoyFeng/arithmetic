package com.dafeng.lib;

/**
 * 除了1和本身之外，没有其他可以整除的数
 */
public class Sushutongji {

    //最简单版的暴力统计
    public static int bf(int n) {
        int count = 0;
        if(n<=1) {
            return count;
        }
        for (int i = 2; i < n; ++i) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    //埃氏筛选
    public static int eratosthenes(int n){
        int count=0;
        boolean[] isPrime=new boolean[n];
        for (int i = 2; i < n; i++) {
            if(!isPrime[i]){
                count++;
                for (int j = i*i; j <n ; j=j+i) {
                    isPrime[j]=true;
                }
            }
        }
        return count;

    }



    //为什么要小于根号x？？？？  例如：x=12  2*6=12，3*4=12  但是6*2和4*3也是12，中间点就是
    //根号12  因为在根号12 后，两个乘数后方就小于前方了，比如4*3，3<4
    private static boolean isPrime(int x) {
//        for (int i = 2; i < x; i++) {
        //优化后ii
        for (int i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }






}