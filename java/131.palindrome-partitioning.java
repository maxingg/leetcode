/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start
class Solution {
    /**
     * 决策树思路，类比于数字，对于字符串来说当然是子字符串的组合。
     */
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        backtrack(list, new ArrayList<>(), 0, chars);
        return list;
    }

    private void backtrack(List<List<String>> list, ArrayList<String> subList, int start, char[] chars) {
        //走到字符串s的末尾，意味着一种回文子字符串切分完成
        if(chars.length == start)
            list.add(new ArrayList<String>(subList));
        else {
            for(int i = start; i < chars.length; i++) {
                if(isPalindrome(chars, start, i)) {
                    subList.add(subString(chars, start, i));
                    backtrack(list, subList, i + 1, chars);
                    subList.remove(subList.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(char[] chars, int start, int end) {
        while(start < end)
            if(chars[start++] != chars[end--])
                return false;
        return true;
    }

    private String subString(char[] chars, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i <= end; i++)
            sb.append(chars[i]);
        return sb.toString();
    }
}
// @lc code=end

