package HOT100;

public class Number5 {

    /**
     * 最长回文子串
     *
     * 给你一个字符串 s，找到 s 中最长的回文子串。
     *
     *
     * 示例 1：
     *
     * 输入：s = "babad"
     * 输出："bab"
     * 解释："aba" 同样是符合题意的答案。
     * 示例 2：
     *
     * 输入：s = "cbbd"
     * 输出："bb"
     * 示例 3：
     *
     * 输入：s = "a"
     * 输出："a"
     * 示例 4：
     *
     * 输入：s = "ac"
     * 输出："a"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        String s = "babad";
        String s1 = longestPalindrome2(s);
        System.out.println(s1);
    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        if(length<2){
            return s;
        }

        int max = 1;
        int len = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(j-i+1>max&&checkBack(chars,i,j)){
                    len = i;
                    max = j-i+1;
                }
            }
        }

        return s.substring(len,len+max);
    }

    private static boolean checkBack(char[] chars, int i, int j) {
        while(i<j){
            if(chars[i]!=chars[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static String longestPalindrome2(String s) {
        int max = 0;
        String s1 = "";
        if(s==null||s.length()<=0){
            return "";
        }
        for(int i = 0;i<s.length();i++){
            int l = i;
            int r = i;
            int rever1 = rever(l, r, s);
            int rever2 = rever(l,r+1,s);
            int max1 = Math.max(rever1, rever2);
            if(max1>0){
                if(max1>max){
                    max = max1;
                    s1 = s.substring((i - (max1 - 1) / 2), (i + max1 / 2) + 1);
                }
            }
        }
        return s1;
    }

    private static int rever(int l, int r, String s) {
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}
