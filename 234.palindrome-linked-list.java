/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        //处理回文相关的问题肯定要进行翻转操作
        //这里与第9题的整数有相似之处,我们依然只翻转一半
        //链表中间的位置通过fast,slow来锁定
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
            slow = slow.next;   //这里让slow充当右链表头结点(长度: 右<=左链表)
        slow = reverseLinkedList(slow);
        fast = head;

        while(slow != null) {
            if(slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode newList = null;
        while(head != null) {
            ListNode rest = head.next;
            head.next = newList;
            newList = head;
            head = rest;
        }
        return newList;
    }
}
// @lc code=end

