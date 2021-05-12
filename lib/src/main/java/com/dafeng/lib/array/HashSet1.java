package com.dafeng.lib.array;

/**
 * @author fengda
 * @time 2021/5/12 10:35
 * @desc 无重复字符的最长子串
 * @updateAuthor Author
 * @updateDate Date
 * <p>
 * 题目要求
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1: 输入: "abcabcbb" 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 解题思路：
 * 1.将字符串转化为字符数组，利用 HashSet 去除重复字符的功能，从第一个字符开始，放入 HashSet 中，直到出现重复的字符为止，
 * 此时就是从第一个字母开始的最大子串长度；然后第二次从第二个字符开始，进行第一步的操作，求出从第二
 * 个字符开始的最大子串长度。利用外层 for 循环控制从每一个个字符开始的子串的长度，内层 for 循环比较是否是连续的非重复字符串。
 * <p>
 * 注意事项：内存for循环的j应该从第一个循环的开始为开始，得舍弃第一次出现重复的那个字符
 * <p>
 * 时间复杂度：O(n 平方 2)
 * 空间复杂度：O(n)
 * <p>
 * 2.滑动窗口：定义一个左侧指针，定义一个右侧指针，右侧指针一直向右移动，直到出现重复元素位置；
 * 然后左侧指针开始启动，左侧指针向右移动一个位置，我们从 HashSet 中移除一个重复的字符，在右侧指针向右移动时，我们向 HashSet 中添加一个字符
 * <p>
 * 注意事项:i + 1左侧字符右进一位，一定要先移除 HashSet 中的字符数组的第一个元素，代表着一个新的子串的产生
 * <p>
 * 时间复杂度：O(n)
 * 空间复杂度：O(n)
 */
public class HashSet1 {

    //题解1
    public int getSubStringLength1(String s) {
        int maxLength = 0;
        //1判断字符串的合法性
        if (s == null || s.equals("")) {
            return maxLength;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int length = 0;
            Set<Character> hashSet = new HashSet<>();
            for (int j = i; j < chars.length; j++) {
                if (hashSet.contains(chars[j])) {
                    break;
                } else {
                    hashSet.add(chars[j]);
                }
                length = hashSet.size();
            }
            //找到最大的
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }


    //题解2
    public int getSubStringLength2(String s) {
        Set<Character> hashSet = new HashSet<>();
        int leftPosition = -1;
        int length = s.length();
        int startLength = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                hashSet.remove(chars[i - 1]);
            }
            while (leftPosition + 1 < length && !hashSet.contains(chars[leftPosition + 1])) {
                hashSet.add(chars[leftPosition + 1]);
                leftPosition++;
            }

            startLength = Math.max(startLength, hashSet.size());
        }

        return startLength;
    }
}
