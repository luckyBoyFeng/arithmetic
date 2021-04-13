package com.dafeng.lib.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fengda
 * @time 2021/4/2 11:16
 * @desc 两个数组的交集
 * @updateAuthor Author
 * @updateDate Date
 */
public class Array1 {

    public static void main(String[] args) {
        int[] nums1= new int[]{10,11,1,2,3,4,5,6};
        int[] nums2= new int[]{10,11,1,2,3,4,5,6,7,8,9,23};
        Integer[] integers = sortedArrayIntersection(nums1, nums2);
        System.out.println(Arrays.toString(integers));
    }

    /*
     * 乱序数组求交集
     */
    public static Integer[] arrayIntersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> container = new HashMap<>();
        for (int num : nums1) {
            container.put(num, container.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            int count = container.getOrDefault(num, 0);
            if (count > 0) {
                result.add(num);
                container.put(num, --count);
            }
        }
        return result.toArray(new Integer[0]);
    }

    /**
     * 顺序数组求交集
     */
    public static Integer[] sortedArrayIntersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray(new Integer[0]);
    }

}
