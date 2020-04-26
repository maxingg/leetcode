/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    //这个题关键在于对重复组合的处理，并且常规思路复杂度肯定是O(n^2)
    //所以我们定义两个指针相向往里走
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> re = new LinkedList<>();
        for(int i = 0; i < len - 2 && nums[i] <= 0; i++)
            if(i == 0 || (nums[i] != nums[i - 1])) {  //索引i所在的值已经穷尽了所有的三元组可能性，所以要全部跳过
                int low = i + 1, high = len - 1;
                while(low < high) {
                    //接下来跳过重复的元素也是必须的操作，在i固定时，对于特定的low或high，第三者的值也是固定的，所以要避免重复加入
                    if(nums[low] + nums[high] == -nums[i]) {
                        re.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low + 1])
                            low++;
                        while(low < high && nums[high] == nums[high - 1])
                            high--;
                        low++;
                        high--;
                    }else if(nums[low] + nums[high] > -nums[i])   
                        high--;
                    else
                        low++;
                }
             }
        return re;
    }
}
// @lc code=end

