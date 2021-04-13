package com.dafeng.lib.array;

/**
 * @author fengda
 * @time 2021/4/7 11:12
 * @desc 最长公共前缀
 * @updateAuthor Author
 * @updateDate Date
 */
public class Array2 {


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
