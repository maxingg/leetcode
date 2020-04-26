/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    /**
     * Floyd循环检测真好用, 2333
     */
    int sum(int num) {
        int sum = 0;
        while(num != 0) {
            int tmp = num % 10;
            sum += tmp;
            num /= 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int fast = num, slow = num;
        do {
            slow = sum(num);
            fast = sum(fast);
            fast = sum(fast);
            if(fast < 10)
                return fast;
        }while(slow != fast);
        return slow;

        //数学大佬的总结, 瑟瑟发抖...
        //三种情况   1.num=0   2.num%9 == 0 && num != 0   3.num % 9 != 0
        // return 1 + (num - 1) % 9;
    }
}
// @lc code=end

