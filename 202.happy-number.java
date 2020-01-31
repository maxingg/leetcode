/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    int digitSquareSum(int n) {
        int sum = 0;
        while(n != 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        //这里的核心思想是利用set存储不可重复元素,发现死循环，即确定非Happy数字
        //  Set<Integer> loop = new HashSet<Integer>();
        //  int squareSum = 0;
        //  while(loop.add(n)) {
        //     while(n != 0) {
        //         int tmp = n % 10;
        //         squareSum += tmp * tmp;
        //         n /= 10;
        //     }
        //     if(squareSum == 1)
        //         return true;
        //     n = squareSum;
        //     squareSum = 0;
        //  }
        //  return false;

        //然而在leetcode上大家讨论得最多的是Floyd 循环检测(一快一慢指针)
        //用龟兔赛跑举例:  乌龟最终追上兔子的原因是: 
        //1.兔子已经陷入死循环，两只动物在死循环里碰头    
        //2.兔子已到达终点,继续跑也只是原地踏步,乌龟最终追上

        //评论大神给出了优化方案: 我们的目的不是让乌龟追上兔子,而是确认有一个可以到达的合理终点,而非死循环
        //因此不必等待乌龟追上兔子,而是增加一次对兔子到达终点的检测
        int slow = n, fast = n;
        do {
            //乌龟走一步,兔子走两步
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
            if(slow == 1) 
                return true;
        }while(slow != fast);
        return false;
    }
}
// @lc code=end

