/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {
    //StefanPochmann是永远的大神！！
    //三条规则对应三种判断
    //例: 既然行值不能重复，那就向set记录占据特定行的数字
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++)
            for(int j = 0; j < 9; j++) {
                char c = board[i][j];
                if(c != '.')
                    if(!set.add(c + "in row" + i) || !set.add(c + "in column" + j) || !set.add(c + "in subblock " + i / 3 + '-' + j / 3))
                        return false;
            }
        return true;
    }
}
// @lc code=end

