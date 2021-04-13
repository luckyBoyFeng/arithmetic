package com.dafeng.lib;

import com.dafeng.lib.array.Array2;


public class MyClass {

    public static void main(String[] args) {
        //数组重复元素
//        int[] nums1= new int[]{10,11,1,2,3,4,5,6};
//        int[] nums2= new int[]{10,11,1,2,3,4,5,6,7,8,9,23};
//        Integer[] integers = sortedArrayIntersection(nums1, nums2);
//        System.out.println(Arrays.toString(integers));
//    }
        //最长公共前缀(14)
        String[] string = new String[]{"abc", "adc", "aaa"};
        String s = Array2.longestCommonPrefix(string);
        System.out.println(s);
    }


}