/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
     * 不考虑之前c/c++中将l2结点插入l1的做法，我们构建一个额外的链表
     */
    // public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     if(l1 == null)
    //         return l2;
    //     else if(l2 == null)
    //         return l1;
    //     ListNode dummy = new ListNode(0);
    //     ListNode curr = dummy;
    //     while(l1 != null && l2 != null){
    //         if(l1.val <= l2.val) {
    //             curr.next = l1;
    //             l1 = l1.next;
    //         }else {
    //             curr.next = l2;
    //             l2 = l2.next;
    //         }
    //         curr = curr.next;
    //     }
    //     curr.next = l1 == null ? l2 : l1;
    //     return dummy.next;  //第一个结点为空结点
    // }

    //再考虑迭代写法, 很精妙
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return l1 != null ? l1 : l2;
        ListNode first = (l1.val <= l2.val) ? l1 : l2;
        first.next = mergeTwoLists(first.next, first == l1 ? l2 : l1);
        return first;
    }
}
// @lc code=end

