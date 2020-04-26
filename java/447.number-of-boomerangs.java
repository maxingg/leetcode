/*
 * @lc app=leetcode id=447 lang=java
 *
 * [447] Number of Boomerangs
 */

// @lc code=start
class Solution {
    //题目的描述是至今为止比较复杂和抽象的了
    //直译一下这个题就是寻找所有点的等腰三角形组合(三点)并考虑顺序
    //看似是二维数组，若把点看作基本元素，这就是点的一维数组
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < points.length; i++) {
            for(int j = 0; j < points.length; j++) {
                if(i == j)
                    continue;
                int distance = calDistance(points[i], points[j]);
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }
            for(int count : map.values())
                result += count * (count - 1);   //本来是C(n,2),因为考虑顺序, 所以要乘2
            map.clear();
        }
        return result;
    }

    private int calDistance(int[] pointsI, int[] pointsJ) {
        int dx = pointsI[0] - pointsJ[0];
        int dy = pointsI[1] - pointsJ[1];
        return dx * dx + dy * dy;
    }   
}
// @lc code=end

