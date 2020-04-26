/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * 本来想着记录长度，进行两遍循环，这样的缺点是每次都必须先遍历一遍记录长度,效率较低
     * 大神的回答让我拜服: 假设两个链表长分别为a和b, 那么无论如何a + b = b + a
     * 也就是说，我们最多两次循环解决问题
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        ListNode a = headA;
        ListNode b = headB;
        while(a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
// @lc code=end

