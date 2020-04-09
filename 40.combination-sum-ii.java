/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(),candidates, 0, target);
        return list;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> subList, int[] candidates, int start, int target) {
        if(target == 0) 
            list.add(new ArrayList<Integer>(subList));
        else if(target > 0) {
            for(int i = start; i < candidates.length; i++) {
                //当前层级的结点如果碰到相同的，肯定已经被试过了，直接过滤
                if(i > start && candidates[i] == candidates[i - 1])
                    continue;
                if(target >= candidates[i]) {
                    subList.add(candidates[i]);
                    backtrack(list, subList, candidates, i + 1, target - candidates[i]);
                    subList.remove(subList.size() - 1);
                }
            }
        }
    }
}
// @lc code=end

