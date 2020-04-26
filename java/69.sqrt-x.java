/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        //类比在一个有序数列中寻找这个数，这时可以使用折半查找
        // if(x == 0)
        //     return 0;
        
        // int low = 1, high = x;
        // while(true) {
        //     int mid = low + (high - low) / 2;
        //     if(mid > x / mid)
        //         high = mid - 1;
        //     else {
        //         if((mid + 1) > x / (mid + 1))
        //             return mid;
        //         low = mid + 1;
        //     }
        // }
        int i = 1, j = x, ret = 0;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(mid <= x / mid) {
                i = mid + 1;
                ret = mid;
            }
            else
                j = mid - 1;
        }
        return ret;
    }
}
// @lc code=end

