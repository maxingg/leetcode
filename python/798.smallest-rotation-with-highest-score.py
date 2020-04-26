#
# @lc app=leetcode id=798 lang=python3
#
# [798] Smallest Rotation with Highest Score
#

# @lc code=start
class Solution:
    # 这个题我们只关注变化
    # 当K++时,我们确定score会减1，因为值和索引相等的哪个元素左移了！！
    def bestRotation(self, A: List[int]) -> int:
        N = len(A)
        change = [1] * N
        for i in range(N): change[(i - A[i] + 1) % N] -= 1
        for i in range(1, N): change[i] += change[i - 1]
        return change.index(max(change)) 
# @lc code=end

