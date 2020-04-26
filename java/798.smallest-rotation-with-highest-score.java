/*
 * @lc app=leetcode id=798 lang=java
 *
 * [798] Smallest Rotation with Highest Score
 */

// @lc code=start
class Solution {
    /**
     * 从题目读来常规思路就是计算出所有轮调的分值，然后比较取索引
     * 稍稍观察一下发现，第k+1次轮调前，进行了k次轮调
     * 这样就可视为动态规划问题(即重复利用子问题的解)。
     * 我们发现，轮调一次的结果可以这样概括:
     * 1.原本首位置的元素到了末尾位置，其值必然小于等于索引值，使得分数加一
     * 2.其他位置(值大于或小于索引的元素)不受影响
     * 3.值等于索引的元素左移一位，这样分数减一， K = (i - A[i] + nlen) % nlen
     * 这样我们可以方便地统计出轮调的变化趋势图，该题彻底转换为股市投资类型的动态规划问题
     * @param A
     * @return
     */
    public int bestRotation(int[] A) {
        int nlen = A.length;
        int[] changes = new int[nlen];
        for(int i = 0; i < nlen; i++)
            //K = (i - A[i] + nlen) % nlen 使得值等于索引,我们只统计K++时的所有减分情况即可
            changes[(i - A[i] + 1 + nlen) % nlen] -= 1;
        int max = 0;
        for(int i = 1; i < nlen; i++) {
            // +1是因为情况1，而当A[i]=0时,同时进行了+1和-1
            changes[i] += changes[i - 1] + 1;
            if(changes[max] < changes[i])
                max = i;
        }
        return max;
    }
}
// @lc code=end

