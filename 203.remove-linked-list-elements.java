/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode cur = first;
        while(cur.next != null)
            if(cur.next.val == val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        return first.next;
    }

    //递归写法很明显类似83题去除重复值，同样要注意不要遗漏尾节点
    // public ListNode removeElements(ListNode head, int val) {
    //     if(head == null)
    //         return null;
    //     head.next = removeElements(head.next, val);
    //     return head.val == val ? head.next : head;
    // }
}
// @lc code=end

