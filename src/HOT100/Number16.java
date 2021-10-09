package HOT100;

import java.util.Arrays;

public class Number16 {

    /**
     *
     * 在排序数组中查找元素的第一个和最后一个位置
     *
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     *
     * 如果数组中不存在目标值 target，返回[-1, -1]。
     *
     * 进阶：
     *
     * 你可以设计并实现时间复杂度为O(log n)的算法解决此问题吗？
     *
     *
     * 示例 1：
     *
     * 输入：nums = [5,7,7,8,8,10], target = 8
     * 输出：[3,4]
     * 示例2：
     *
     * 输入：nums = [5,7,7,8,8,10], target = 6
     * 输出：[-1,-1]
     * 示例 3：
     *
     * 输入：nums = [], target = 0
     * 输出：[-1,-1]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    public static int[] searchRange(int[] nums, int target) {

        if(nums.length<=0){
            return new int[]{-1,-1};
        }

        int right = nums.length-1;
        int left = 0;

        int[] result = new int[]{-1,-1};

        while(right>=0){
            if(left==right&&(result[0]<=-1&&result[1]<=-1)){
                if(nums[left]==target){
                    return new int[]{left,right};
                }
            }

            if(result[0]<=-1 && nums[left]==target){
                result[0] = left;
            }

            if(result[1]<=-1 && nums[right]==target){
                result[1] = right;
            }
            right--;
            left++;
        }

        return result;
    }


    public static void main(String[] args) {
        int [] nums = {1,2,2};
        int[] ints = searchRange(nums, 2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }


}
