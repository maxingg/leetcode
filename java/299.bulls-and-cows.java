/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
    /**
     * bull的计数很容易, 判断相同位置的值即可
     * cow的记录就十分巧妙了
     * appear实际上同时记录了secret和guess的数字出现次数(二者分别一加一减进行计数)
     * 例如if(appear[s[i] - '0']++ < 0)要分三步理解:
     * 1.appear[s[i] - '0'] 说明这个数字在secret中出现一次
     * 2.< 0  说明在guess中已经出现过此数字, 因此 cow++
     * 3.++   已经记录了一次cow,所以进行一次抵消,防止多算
     */
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] appear = new int [10];
        char[] s = secret.toCharArray(), g = guess.toCharArray();
        for(int i = 0; i < s.length; i++)
            if(s[i] == g[i])
                bulls++;
            else {
                if(appear[s[i] - '0']++ < 0)
                    cows++;
                if(appear[g[i] - '0']-- > 0)
                    cows++;
            }
        return bulls + "A" + cows + "B";
    }
}
// @lc code=end

