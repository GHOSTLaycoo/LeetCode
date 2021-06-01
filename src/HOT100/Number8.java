package HOT100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number8 {
    /**
     *
     * 三数之和
     *
     * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     * 示例 2：
     *
     * 输入：nums = []
     * 输出：[]
     * 示例 3：
     *
     * 输入：nums = [0]
     * 输出：[]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/3sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        int[] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        List<List<Integer>> lists = threeSum(nums);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer+" ");
            }
            System.out.println("");
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[left] + nums[right] + nums[i];
                if(sum==0){
                    List<Integer> objects = new ArrayList<>();
                    objects.add(nums[left]);
                    objects.add(nums[right]);
                    objects.add(nums[i]);
                    result.add(objects);
                    while (left<right && nums[left] == nums[left+1]) left++; // 去重
                    while (left<right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
