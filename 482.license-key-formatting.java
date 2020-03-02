/*
 * @lc app=leetcode id=482 lang=java
 *
 * [482] License Key Formatting
 */

// @lc code=start
class Solution {
    //常规思路，逢四(字符)进一('-'),同时要考虑边界情况
    // public String licenseKeyFormatting(String S, int K) {
    //     char[] chars = S.toCharArray();
    //     StringBuilder sb = new StringBuilder();
    //     int count = 0;
    //     int head = 0;
    //     while(head < chars.length && chars[head] == '-')
    //         head++;
    //     for(int i = chars.length - 1; i >= head; i--) {
    //         if(chars[i] == '-')
    //             continue;
    //         sb.insert(0, chars[i]);
    //         count++;
    //         if(count == K && i != head) {
    //             sb.insert(0, '-');
    //             count = 0;
    //         }
    //     }
    //     return sb.toString().toUpperCase();
    // }

    //这个题要在K上下功夫，k是一个小循环，判断是否加'-'
    //我们同样可以转移焦点，放在StringBulder上
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i = chars.length - 1; i >= 0; i--){
            if(chars[i] != '-')
                sb.append(sb.length() % (k + 1) == k ? '-' : "").append(chars[i]);
        }
        return sb.reverse().toString().toUpperCase();
    }
}
// @lc code=end

