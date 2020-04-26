/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //有什么说的，直接加呗
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(0);
        ListNode tmp = sentinel;
        int carry = 0;
        //加上carry != 0是考虑最后多一位进位
        while(l1 != null || l2 != null || carry != 0) {
            int sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
            ListNode cur = new ListNode(sum % 10);
            carry = sum / 10;
            tmp.next = cur;
            tmp = tmp.next;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return sentinel.next;
    }
}
// @lc code=end

