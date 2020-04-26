/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

// @lc code=start
class Solution {
    /**
     * 典型的逆向思维，上下相加共有10位,n也可能是从0到n的任何数，没有人可以简单而有效地遍历
     * 我们把目标转向时钟显示的结果,如果h * 64 + m(h,m 分别为小时和分钟数)中1的个数为num, 我们就得到了一种结果
     * 这样最多12*60次操作，就可以得出全部结果
     */
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for(int h = 0; h < 12; h++)
            for(int m = 0; m < 60; m++) {
                if(Integer.bitCount(h * 64 + m) == num)
                    // times.add(String.format("%d:%02d", h, m));
                    times.add(h + ":" + ((m < 10) ? ("0" + m) : m));
            }
        return times;
    }
}
// @lc code=end

