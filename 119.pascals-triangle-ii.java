/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class Solution {
    //仍然是上题的思想,只是这次换用数组操作则更为高效
    public List<Integer> getRow(int rowIndex) {
        //简单对上题进行改动即可,但都是在List基础上的函数调用
        // List<Integer> row = new ArrayList<>();
        // for(int i = 0; i <= rowIndex; i++) {
        //     for(int j = row.size() - 1; j >= 1; j--)    //第n(n>=2)行变为第n+1行
        //         row.set(j, row.get(j) + row.get(j-1));
        //     row.add(1);
        //     if(row.size() == (rowIndex + 1))
        //         return row;
        // }

        // throw new IllegalArgumentException("返回失败");
        
        //下面改用数组,少了add(),替代了set,少了赋值
        Integer[] arr = new Integer[rowIndex + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        for(int i = 0; i <= rowIndex; i++)
            for(int j = i; j >= 1; j--) 
                arr[j] = arr[j] + arr[j-1];
        return Arrays.asList(arr);
    }
}
// @lc code=end

