/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    //这次是单链表上的 a+b= b+a问题
    //或者这么理解: 两个链表结点相距n-1,那么让右结点跳到尾节点位置(两节点同时移动)，此时的左节点就是所求解
    //简称: 一人得道，鸡犬升天(得有裙带关系)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode right = newHead;
        ListNode left = newHead;
        while(n-- > 0)
            right = right.next;
        while(right.next != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return newHead.next;
    }
}
// @lc code=end

