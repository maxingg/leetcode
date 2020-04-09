/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
/**
 * 同78题
 * 区别在于此题要求的是所有的三三组合(元素的组合方式不同即可)
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> tmplist, int[] nums) {
        if(tmplist.size() == nums.length) {
            list.add(new ArrayList<Integer>(tmplist));
            return;
        }
        for(int i = 0; i < nums.length; i++) {      //与78题的区别在此，要遍历所有的可能，就要每次从头开始寻找
            if(tmplist.contains(nums[i]))
                continue;
            tmplist.add(nums[i]);
            backtrack(list, tmplist, nums);
            tmplist.remove(tmplist.size() - 1);
        }
    }
} 
// @lc code=end

