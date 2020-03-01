/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        //此题比较简单，简单的异或操作即可将位值相同的为排除，再利用与运算将这些位进行计数即可
        int num = x ^ y;
        int count = 0;
        // while(num != 0) {
        //     if((num & 1) == 1)
        //         count++;
        //     num >>>= 1;
        // }
        
        //统计1的个数还可以使用我们之前学会的一种方法 num & (num - 1)
        while(num != 0) {
            num &= num - 1;
            count++;
        }   
        return count;
    }
}
// @lc code=end

