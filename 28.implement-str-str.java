/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        //双指针扫描，不过我用了麻烦的写法
        // if(haystack == null || haystack.length() < needle.length())
        //     return -1;
        // if(needle.equals(""))
        //     return 0;
        // int i = 0, j = 0;
        // while(j < haystack.length()){
        //     if(haystack.charAt(j) == needle.charAt(0)) {
        //         for(i = 0; i < needle.length(); i++) {
        //             if(j + i >= haystack.length())     //指针扫描特别注意越界问题！！！
        //                 return -1;
        //             if(haystack.charAt(j + i) != needle.charAt(i))
        //                 break;
        //         }
        //         if(i == needle.length())
        //             return j;
        //     }
        //     j++;
        // }
        // return -1;
        if(needle.isEmpty())
            return 0;
        int len1= haystack.length(), len2 = needle.length();
        for(int i = 0; i <= len1 - len2; i++)    //干脆取最小检索长度,效率提升同时解决越界问题
            for(int j = 0; haystack.charAt(i+j) == needle.charAt(j); j++)
                if(j == len2 - 1)
                    return i;
        return -1;
    }
}
// @lc code=end

