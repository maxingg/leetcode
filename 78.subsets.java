/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    //其实就是在寻找所有组合的可能性
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), 0, nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> sublist, int start, int[] nums) {
        list.add(new ArrayList<>(sublist));
        for(int i = start; i < nums.length; i++) {
            sublist.add(nums[i]);
            backtrack(list, sublist, i + 1, nums);
            sublist.remove(sublist.size() - 1);     //删除末尾元素，消除递归影响，看来是常用套路
        }
    }
}
// @lc code=end

