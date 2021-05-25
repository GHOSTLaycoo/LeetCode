package HOT100;

import java.util.ArrayList;
import java.util.List;

public class Number3 {

    /**
     * 无重复字符的最长子串
     *
     * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
     *
     *
     *
     * 示例1:
     *
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     *
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     *
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
     *     请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
     * 示例 4:
     *
     * 输入: s = ""
     * 输出: 0
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        String s = " ";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int curry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            Character c = s.charAt(i);
            if(stringBuilder.indexOf(String.valueOf(c))!=-1){
                int i1 = stringBuilder.indexOf(String.valueOf(c));
                String substring = stringBuilder.substring(i1+1);
                stringBuilder = new StringBuilder(substring);
                stringBuilder.append(c);
                curry = stringBuilder.length();
            }else{
                stringBuilder.append(c);
                curry++;
            }
            max = max>curry?max:curry;
        }
        return max;
    }
}
