/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    //这样的一对一映射思路很好理出来，关键是如何处理字符串及处理顺序
    private static String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(num > 0) {
            while(num >= values[index]) {
                num -= values[index];
                sb.append(roman[index]);
            }
            index++;
        }
        return sb.toString();
    }
}
// @lc code=end

