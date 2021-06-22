package com.dafeng.lib.array;

public class DeleteArrayRepetition {

    //思路，就是第二个和第一个进行比较，如果不相等

    public static int removeDuplicates(int[] nums){
        int i=0;
        for (int j = 1; j <nums.length ; j++) {
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

}