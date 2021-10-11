package HOT100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number17 {

    /**
     *
     * 组合总和
     *
     * 给定一个无重复元素的正整数数组candidates和一个正整数target，找出candidates中所有可以使数字和为目标数target的唯一组合。
     *
     * candidates中的数字可以无限制重复被选取。如果至少一个所选数字数量不同，则两种组合是唯一的。
     *
     * 对于给定的输入，保证和为target 的唯一组合数少于 150 个。
     *
     *
     * 示例1：
     *
     * 输入: candidates = [2,3,6,7], target = 7
     * 输出: [[7],[2,2,3]]
     * 示例2：
     *
     * 输入: candidates = [2,3,5], target = 8
     * 输出: [[2,2,2,2],[2,3,3],[3,5]]
     * 示例 3：
     *
     * 输入: candidates = [2], target = 1
     * 输出: []
     * 示例 4：
     *
     * 输入: candidates = [1], target = 1
     * 输出: [[1]]
     * 示例 5：
     *
     * 输入: candidates = [1], target = 2
     * 输出: [[1,1]]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/combination-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); // 先进行排序
        backtracking(res, new ArrayList<>(), candidates, target, 0, 0);
        return res;
    }

    public void backtracking(List<List<Integer>> res, List<Integer> path, int[] candidates, int target, int sum, int idx) {
        // 找到了数字和为 target 的组合
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            // 如果 sum + candidates[i] > target 就终止遍历
            if (sum + candidates[i] > target) break;
            path.add(candidates[i]);
            backtracking(res, path, candidates, target, sum + candidates[i], i);
            path.remove(path.size() - 1); // 回溯，移除路径 path 最后一个元素
        }
    }
}
