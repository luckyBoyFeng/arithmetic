package com.dafeng.lib.sort;

/**
 * LeetCode069——x的平方根
 */
public class XSort {

    public static int mySqrt(int x) {
        int index = -1, left = 0, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid <= x) {
                index = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}