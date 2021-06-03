package HOT100;

import java.util.*;

public class Number9 {

    /**
     *
     * 电话号码的字母组合
     *
     * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
     *
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     *
     *
     *
     * 示例 1：
     *
     * 输入：digits = "23"
     * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
     * 示例 2：
     *
     * 输入：digits = ""
     * 输出：[]
     * 示例 3：
     *
     * 输入：digits = "2"
     * 输出：["a","b","c"]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static List<String> Permutation = new ArrayList<String>();


    public static void main(String[] args) {
        String digits = "2";
        List<String> strings = letterCombinations(digits);
        for (String string : strings) {
            System.out.println(string+" ");
        }
    }

    public static List<String> letterCombinations(String digits) {
        Map<Character, List<String>> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put('2', Arrays.asList("a","b","c"));
        objectObjectHashMap.put('3', Arrays.asList("d","e","f"));
        objectObjectHashMap.put('4', Arrays.asList("g","h","i"));
        objectObjectHashMap.put('5', Arrays.asList("j","k","l"));
        objectObjectHashMap.put('6', Arrays.asList("m","n","o"));
        objectObjectHashMap.put('7', Arrays.asList("p","q","r","s"));
        objectObjectHashMap.put('8', Arrays.asList("t","u","v"));
        objectObjectHashMap.put('9', Arrays.asList("w","x","y","z"));

        char[] chars = digits.toCharArray();
        List<List<String>> list = new ArrayList<>();
        for (char aChar : chars) {
            list.add(objectObjectHashMap.get(aChar));
        }
        permutation(list,"");
        return Permutation;
    }

    public static void permutation( List<List<String>> list,String preStr) {
        int size = list.size();
        if(size==0){
            return;
        }

        if(1==size){
            for(int i=0; i<list.get(0).size(); i++) {
                Permutation.add(preStr + list.get(0).get(i));
            }
        }
        else{
            List<String> permu = new ArrayList<String>(list.get(0));
            List<List<String>> now = new ArrayList<List<String>>(list);
            now.remove(0);
            for(int i=0; i<permu.size(); i++){
                permutation(now, preStr +permu.get(i));
            }
        }
    }

}
