/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    /**
     * 迭代方式，从左到右一个个插入新链表即可
     */
    public ListNode reverseList(ListNode head) {
        ListNode newList = null;
        while(head != null) {
            //注意要先保存后续结点，避免丢失！！
            ListNode rest = head.next;
            head.next = newList;
            newList = head;
            head = rest;
        }
        return newList;
    }

    //递归方式
    // public ListNode reverseList(ListNode head) {
    //     //注意这里对nextNode的处理才是递归翻转的核心指针，newHead适中指向新链表的头结点,你必须将每一层的当前结点先保存起来
    //     //如果只用newHead,不出意外，你翻转得到的链表最多只有两个结点
    //     if(head == null || head.next == null)
    //         return head;
    //     ListNode nextNode = head.next;
    //     ListNode newHead = reverseList(nextNode);
    //     nextNode.next = head;
    //     head.next = null;
    //     return newHead;
    // }
}
// @lc code=end

