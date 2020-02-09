/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String str) {
        //重复的子字符串有明显的数学关系，其长度一定可以整除整个字符串
        //找到可以整除的子符串,然后用它来匹配源字符串的每一段(这样的要求比较严苛,容易排除)
        //如果是用其构造新字符串与原串比较则效率较低
        int len = str.length();
        for(int i = len / 2; i > 0; i--) {
            if(len % i == 0) {
                int count = len / i;
                String subString = str.substring(0, i);
                int j = 0;
                for(; j < count; j++)
                    if(!subString.equals(str.substring(i*j, i*(j+1))))
                        break;
                if(j == count)
                    return true;
            }
        }
        return false;
    }
}
// @lc code=end

