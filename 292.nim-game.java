/*
 * @lc app=leetcode id=292 lang=java
 *
 * [292] Nim Game
 */

// @lc code=start
class Solution {
    /**
     * 每回合每个人最少出一个数，最多出三个数
     * 即先后手都可以用4来控制游戏的主动权
     * 先手若获胜必须模4有余数，后手则必须整除
     */
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
// @lc code=end

