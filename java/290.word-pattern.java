/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
class Solution {
    /**
     * 这个题可以类比为同构问题
     * 补充Integer比较的要点
     * 1.integer是int的包装类，int是基本数据类型。 
     * 2.integer变量必须实例化以后才能使用，int不用 
     * 3.integer实际上是一个对象，int只是数据值。 
     * 4.integer默认Null，int默认0
     * Integer之间比较要用equals，Integer和int比较直接用==，会自动拆箱
     */
    public boolean wordPattern(String pattern, String str) {
        char[] pChar = pattern.toCharArray();
        String[] splitStr = str.split(" ");
        if(pChar.length != splitStr.length)
            return false;
        Map<String, Integer> mapStr = new HashMap<>();
        Map<Character, Integer> mapChar = new HashMap<>();
        for(int i = 0; i < pChar.length; i++) {
            if(!mapChar.getOrDefault(pChar[i], 0).equals(mapStr.getOrDefault(splitStr[i], 0)))
                return false;
            mapChar.put(pChar[i], i + 1);
            mapStr.put(splitStr[i], i + 1); 
        }
        return true;
    }
}
// @lc code=end

