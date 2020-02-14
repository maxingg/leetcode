/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    //题目体现唯一思想均可尝试Hash:   唯一对应关系(同构),唯一值，唯一解
    //这个题还要关注同构的特点: 同种结构,与其a -> c, 不如  a, c -> 1,将他们映射到相同的数字
    //注意:  同构是一一映射，单独的hashMap是满射而非单射!!   本题还可以尝试HashMap
    public boolean isIsomorphic(String s, String t) {
         int[] m1 = new int[256], m2 = new int[256];
         char[] str1 = s.toCharArray(), str2 = t.toCharArray();
         for(int i = 0; i < str1.length; i++) {
            if(m1[str1[i]] != m2[str2[i]])
                return false;
            m1[str1[i]] = i + 1;
            m2[str2[i]] = i + 1;
         }
         return true;
    }
}
// @lc code=end

