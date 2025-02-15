package org.zifuString.secondary;

import java.util.Arrays;

/**
 * @Author pudding
 * @email gyh020815@outlook.com
 * @Date 2025/1/5 下午6:46
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] split = s.split("\\s+");
        int len = split.length;
        StringBuffer res = new StringBuffer();
        for (int i = len - 1; i >= 0; i--) {
            if (split[i] != " ") {
                res.append(split[i]+" ");
            }
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords("a    good     example"));
    }
}
