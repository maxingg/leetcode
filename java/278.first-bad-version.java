/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //这个题算是二分查找的特殊情况，false之后都是true,相当于000000111,还是符合二分查找的规律的
        int head = 1, tail = n;
        while(head < tail) {
            int middle = head + (tail - head) / 2;
            if(isBadVersion(middle))
                tail = middle;
            else
                head = middle + 1;
        }
        return head;
    }
}
// @lc code=end

