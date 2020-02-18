/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 */

// @lc code=start
class Solution {
    /**
     * 找出直接的数学映射关系，每条内边都会被两个方块共享，数学式: 4 * 方块数 - 2 * 内边数
     */
    public int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    islands++;
                    //对于内边的记录可以关注一下
                    if(i > 0 && grid[i - 1][j] == 1)
                        neighbours++;
                    if(j > 0 && grid[i][j - 1] == 1)
                        neighbours++;
                }
            }
        return 4 * islands - 2 * neighbours;
    }
}
// @lc code=end

