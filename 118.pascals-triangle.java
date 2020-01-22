/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        //先是常规思路
        // List<List<Integer>> triangle = new ArrayList<>();
        // for(int i = 0; i < numRows; i++) {
        //     List<Integer> row = new ArrayList<>();
        //     for(int j = 0; j <= i; j++) {
        //         if(j == 0 || j == i)
        //             row.add(1);
        //         else
        //             row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
        //     }
        //     triangle.add(row);
        // }

        // return triangle;

        //leetcode上一位达人的代码刷新了我对这个问题的认识，将二维问题用操作一维对象的方法解决
        //认识:  下一行的数据实际是上一行数据进行规律运算的结果，故可直接对行进行操作,  常规思路只是把数字的排放规律展示出来而已
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            //对左右两个1直接添加, 其余的进行以下运算
            for(int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j-1));
            }
            row.add(1);
            triangle.add(new ArrayList(row));
        }
        return triangle;
        
    }
}
// @lc code=end

