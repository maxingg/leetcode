/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        //常规方法, 直接遍历找到s第i字符,就继续无脑扫描找下一个
        if(s.length() == 0)
            return true;
        int indexS = 0, indexT = 0;
        while(indexT < t.length()) {
            if(s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
                if(indexS == s.length())
                    return true;
            }
            indexT++;
        }
        return false;
        

        //但如果是多次输入字符串检验,开销就明显增大(每次都要遍历字符串t)
        //代替的方案是使用list数组记录t的各字符索引,然后遍历输入字符串s
    }
}
// @lc code=end

