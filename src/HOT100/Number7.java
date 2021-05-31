package HOT100;

import sun.awt.windows.ThemeReader;

public class Number7 {

    /**
     *
     * 盛最多水的容器
     *
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,ai) 和 (i, 0) 。找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
     *
     * 说明：你不能倾斜容器。
     *
     *
     *
     * 示例 1：
     *
     *
     *
     * 输入：[1,8,6,2,5,4,8,3,7]
     * 输出：49
     * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为49。
     * 示例 2：
     *
     * 输入：height = [1,1]
     * 输出：1
     * 示例 3：
     *
     * 输入：height = [4,3,2,1,4]
     * 输出：16
     * 示例 4：
     *
     * 输入：height = [1,2,1]
     * 输出：2
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/container-with-most-water
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int i = maxArea(height);
        System.out.println(i);
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;

        int max = 0;

        while(i<j){
            int result = Math.min(height[i], height[j]) * (j - i);
            max = max < result ? result : max;
            if(height[i]>height[j]){
                j--;
            }else {
                i++;
            }
        }
        return max;
    }

    public int maxAreaGood(int[] height) {
        int low = 0,high = height.length -1;
        int res = 0;

        while(low < high){
            if(height[low] < height[high]){
                res = Math.max(res,(high - low)*height[low]);
                low++;
            }else{
                res = Math.max(res,(high - low)*height[high]);
                high--;
            }
        }
        return res;
    }
}
