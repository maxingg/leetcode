/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    //我们把手机对应的键位记录下来
    private String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<String>();
        if(digits.isEmpty())
            return res;
        char[] chars = digits.toCharArray();
        res.add("");
        //观察得到最后的结果字符串与所给数字字符串登长
        for(int i = 0; i < chars.length; i++) {
            int digit = chars[i] - '0';
            while(res.peek().length() == i) {  //本题亮点所在,!=时已完成所有字符的添加工作(充分利用队列)
                String tmp = res.remove();
                for(char c : mapping[digit].toCharArray())
                    res.add(tmp + c);
            }
        }
		return res;
    }
}
// @lc code=end

