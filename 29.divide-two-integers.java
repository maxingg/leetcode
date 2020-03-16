/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    /**
     * 我们应对除法的直接思路是除法变减法，这样一个大概的雏形是排除溢出情况外，不停地减去除数
     * 但这样有很大缺点: 除数过大，被除数过小时耗费过长时间，效率低
     * 因此可以考虑变除数(步长)
     * 怕步子迈得大扯着蛋?那就一步一步来
     */
    public int divide(int dividend, int divisor) {
        if(dividend == 0)
            return 0;
        if(divisor == 1)
            return dividend;
        if(divisor == -1)
            return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend;
        boolean isNeg = ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0));
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        long res = 0, curr = 1;     //curr就是步子大小，即除数的2的倍数
        long sub = ldivisor;
        while(ldividend >= ldivisor) {
            if(sub <= ldividend) {   
                ldividend -= sub;
                res += curr;
                curr <<= 1;         //因为左移的操作，必须考虑溢出的情况
                sub <<= 1;
            } else {    //扯着蛋了，步子小一点
                curr >>= 1;
                sub >>= 1;
            }
        }
        return isNeg ? (int)-res : (int)res;
    }
}
// @lc code=end

