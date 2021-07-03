package HOT100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number11 {

    /**
     *
     * 有效的括号
     *
     *
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     *
     *
     * 示例 1：
     *
     * 输入：s = "()"
     * 输出：true
     * 示例2：
     *
     * 输入：s = "()[]{}"
     * 输出：true
     * 示例3：
     *
     * 输入：s = "(]"
     * 输出：false
     * 示例4：
     *
     * 输入：s = "([)]"
     * 输出：false
     * 示例5：
     *
     * 输入：s = "{[]}"
     * 输出：true
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        boolean valid = isValid("()");
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        List<Character> objects = new ArrayList<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if(objects.size()>0 && (objects.get(objects.size()-1)).equals(map.get(aChar))){
                objects.remove(objects.size()-1);
                continue;
            }else{
                objects.add(aChar);
            }
        }

        if(objects.size()>0){
            return false;
        }
        return true;
    }
}
