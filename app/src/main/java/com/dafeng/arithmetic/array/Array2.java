package com.dafeng.arithmetic.array;

import java.util.Arrays;

/**
 * @author fengda
 * @time 2021/4/7 11:12
 * @desc 最长公共前缀
 * @updateAuthor Author
 * @updateDate Date
 */
public class Array2 {

    public static void main(String[] args) {

        //最长公共前缀(14)
        String[] string= new String[]{"abc","adc","aaa"};
        String s = Array2.longestCommonPrefix(string);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] string) {
        if (string == null || string.length == 0) {
            return "";
        }
        String tamp = string[0];

        for (int i = 0; i < string.length; i++) {
            String compareStr = string[i];
            while (!compareStr.startsWith(tamp)) {
                tamp = tamp.substring(0, tamp.length() - 1);
                if (tamp.length() == 0) {
                    return "";
                }
            }

        }
        return tamp;
    }

}
