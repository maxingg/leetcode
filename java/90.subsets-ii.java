/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
/**
 * 整体思路同78题
 */
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        //去掉重复值
        Arrays.sort(nums);
        subsetsHelper(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }

    private void subsetsHelper(List<List<Integer>> list, List<Integer>tmpList, int[]nums, int start) {
        list.add(new ArrayList<>(tmpList));
        for(int i = start; i < nums.length; i++) {
            if(i == start || nums[i] != nums[i - 1]) {
                //当遇到重复元素时，相关的组合元素已经在上次递归中全部输出(因为start == 0先取到),所以直接跳过，(这样看来，所有的重复元素都进行了同级且最外层删除)
                tmpList.add(nums[i]);
                subsetsHelper(list, tmpList, nums, i + 1);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }
}
// @lc code=end

