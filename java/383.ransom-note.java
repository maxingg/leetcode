/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    //尽可能用数组的思路取实现, 字符出现几次,就在对应数组索引位置计数(产品数量)几次
    //可以类比于生产和消费,先按照杂志字符串生产,再按照勒索信消费各字符(产品)
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        char[] ran = ransomNote.toCharArray(), mag = magazine.toCharArray();
        for(int i = 0; i < mag.length; i++)
            arr[mag[i] - 'a']++;
        for(int i = 0; i < ran.length; i++)
            if(--arr[ran[i] - 'a'] < 0)
                return false;
        return true;
    }
}
// @lc code=end

