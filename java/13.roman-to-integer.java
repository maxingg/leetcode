/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        //以V,I的关系说明本题的关键，从右向左扫描，如果是IV,则当扫描I时累计值>5,则右端必有V,执行减一，否则加一 
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    res += (res >= 5) ? -1 : 1;
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += (res >= 50) ? -10 : 10;
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += (res >= 500) ? -100: 100;
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }
}
// @lc code=end

