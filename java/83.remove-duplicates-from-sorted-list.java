/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    //先尝试一下递归解法
    // public ListNode deleteDuplicates(ListNode head) {
    //     if(head == null || head.next == null)
    //         return head;
    //     head.next = deleteDuplicates(head.next);    //这里先进入下层循环是为了避免遗漏尾节点的检查
    //     return head.val == head.next.val ? head.next : head;    //接着再处理本层情况
    // }

    //用迭代实现
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            while(cur.next != null && cur.val == cur.next.val)
                cur.next = cur.next.next;
            cur = cur.next;
        }
        return head;
    }
}
// @lc code=end

