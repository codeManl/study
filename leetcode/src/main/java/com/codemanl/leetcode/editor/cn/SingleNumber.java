package com.codemanl.leetcode.editor.cn;
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 数组 👍 2016 👎 0

public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
        int[] nums = new int[]{3, 4, 5, 6, 4, 5, 3};
        solution.singleNumber(nums);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            // (a异或b异或a) = b 注意:异或是将a和b转为二进制后进行位异或运算，再将结果转回十进制
            // 5^3    101
            //        011
            //        110   = 6
            int a = nums[0];
            for (int i = 1; i < nums.length; i++) {
                a = a ^ nums[i];
            }
            return a;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}