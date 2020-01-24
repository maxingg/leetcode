/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        //优先队列提供排序,因此最多放3个,超出则丢弃最小的, set对重复元素进行判断
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
            if(set.add(nums[i])) {    //插入元素/判断是否是重复元素
                pq.offer(nums[i]);
                if(pq.size() > 3) {
                    pq.poll();
                }
            }
        if(pq.size() == 2)
            pq.poll();
        return pq.peek();

        //这里TreeSet可综合二者功能(自然排序),但不推荐
        // TreeSet<Integer> set = new TreeSet();
        // for(int num: nums)
        //     if(set.add(num)) {
        //         if(set.size() > 3)
        //             set.pollFirst();
        //     }
        // return set.size() < 3 ? set.last() : set.first();
    }
}
// @lc code=end

