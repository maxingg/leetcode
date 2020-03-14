/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    //非递归做法实在不推荐
    //评论分析得太好，我就厚颜无耻地粘贴了。。
    /**
     * The goal is to print a string of “(“ ,”)” in certain order. The length of string is 2n. The constraints are that “(“s need to match “)”s.
    Without constraints, we just simply print out “(“ or “)” until length hits n. So the base case will be length ==2 n, recursive case is print out “(“ and “)”. The code will look like

    //base case
    if(string length == 2*n) {
    add(string);
    return;
    }
    //recursive case
    add a “(“
    add a “)"

    Let’s add in constraints now. We need to interpret the meanings of constraints. First, the first character should be “(“. Second, at each step, you can either print “(“ or “)”, but print “)” only when there are more “(“s than “)”s. Stop printing out “(“ when the number of “(“ s hit n. The first actually merges into the second condition.
    The code will be:

    //base case
    if(string length == 2*n) {
    add(string);
    return;
    }
    //recursive case
    if(number of “(“s < n){
    add a “(“
    }
    if(number of “(“s > number of “)”s){
    add a “)"

    补充一下，第二个判断条件是因为: 我们总会先加入(,后加入)
     */
    public List<String> generateParenthesis(int n) {
        List<String> re = new ArrayList<String>();
        helper(re, new StringBuilder(), 0, 0, n);
        return re;
    }

    private void helper(List<String> re,  StringBuilder sb, int left, int right, int n) {
        if(left == n && right == n) {
            re.add(sb.toString());
            return;
        }

        if(left < n) {
            sb.append("(");
            helper(re, sb, left + 1, right, n);
            sb.setLength(sb.length() - 1);          //append("(")是给子函数调用的，不应对当前函数产生影响
        }
        if(right < left) {
            sb.append(")");
            helper(re, sb, left, right + 1, n);
            sb.setLength(sb.length() - 1);
        }
    }
}
// @lc code=end

