/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1; //利用有序特点, 以low和high索引部位的值来逼近target
        while(low != high) {
            int tmp = numbers[low] + numbers[high];
            if(tmp == target)
                return new int[]{low+1, high+1};
            else if(target > tmp)
                low++;
            else
                high--;
        }

        throw new IllegalArgumentException("没有两数和能解决的方案");
    }
}
// @lc code=end

