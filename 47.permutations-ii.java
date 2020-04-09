/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> subList, int[] nums, boolean[] used) {
        if(subList.size() == nums.length) {
            list.add(new ArrayList<Integer>(subList));
        }else {
            for(int i = 0; i < nums.length; i++) {
                //1.被选过了自然不能选
                //i-1是false,并非是没有选过，而是选过了又被还原了，相当于当前结点位置已经被用过了,自然也不能选
                if(used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                    continue;
                subList.add(nums[i]);
                used[i] = true;
                backtrack(list, subList, nums, used);
                used[i] = false;
                subList.remove(subList.size() - 1);
            }
        }
    }
}
// @lc code=end

