/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    //在输入大量测试用例时, 使用数组直接访问比调用函数高效得多
    //创建静态数组提供直接访问以代替频繁的函数调用
    public static boolean[] vowels = new boolean[256];
    static {
        vowels['a'] = true;
        vowels['o'] = true;
        vowels['e'] = true;
        vowels['i'] = true;
        vowels['u'] = true;
        vowels['A'] = true;
        vowels['O'] = true;
        vowels['E'] = true;
        vowels['I'] = true;
        vowels['U'] = true;
    }

    public String reverseVowels(String s) {
        if(s.length() <= 1)
            return s;
        int head = 0, tail = s.length() - 1;
        char[] chars = s.toCharArray();
        while(head < tail) {
            while(head < tail && !vowels[chars[head]])
                head++;
            while(head < tail && !vowels[chars[tail]])
                tail--;
            if(head < tail) {
                char c = chars[head];
                chars[head] = chars[tail];
                chars[tail] = c;
                tail--;
                head++;
            }
        }
        return String.valueOf(chars);
    }
}
// @lc code=end


