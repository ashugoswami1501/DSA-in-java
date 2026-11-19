/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode newNode =null;
       ListNode temp=head;
       while(temp!=null){
        ListNode temp1=temp.next;
        temp.next=newNode;
        newNode=temp;
        temp=temp1;
       }
       return newNode;
    }
}