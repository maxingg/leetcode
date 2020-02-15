/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    //变位符意味着所含元素和个数相同
    //我们先偷懒使用快排
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
    
        Arrays.sort(sChar);
        Arrays.sort(tChar);
    
        return Arrays.equals(sChar, tChar);   
    }

    //为了处理unicode字符,这里使用了HashMap,当只是小写字母时,可以使用数组提高效率
    // public boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length())
    //         return false;
    //     Map<Character, Integer> map = new HashMap<>();
    //     char[] sChar = s.toCharArray();
    //     char[] tChar = t.toCharArray();
    //     for(int i = 0; i < sChar.length; i++) 
    //         map.put(sChar[i], map.getOrDefault(sChar[i], 0) + 1);
    //     for(int i = 0; i < tChar.length; i++)
    //         if(map.getOrDefault(tChar[i], 0) == 0)
    //             return false;
    //         else
    //             map.put(tChar[i], map.get(tChar[i]) - 1);
    //     return true;
    // }
}
// @lc code=end

