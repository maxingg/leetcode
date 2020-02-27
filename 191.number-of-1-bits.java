/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //常规方法，一位一位验证
        // int count = 0;
        // for(int i = 0; i < 32; i++)      //考虑while(n != 0)的实现(若1只出现在了低位)
        //     if(((n >> i) & 1) == 1)
        //         count++;
        // return count;

        //一种灵活的方法---考虑如何每次操作擦除二进制的一个1
        int count = 0;
        while(n != 0) {
            n &= (n - 1);   //可以举例子(1111)
            count++;
        }
        return count;
    }
}
// @lc code=end

