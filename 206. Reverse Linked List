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
       
        // none
        if (head == null) {
            return null;
        }
        
        // one
        if (head.next == null) {
            return head;
        }
        
        // initialization
        ListNode nextNode = new ListNode();
        ListNode currentNode = new ListNode();
        ListNode prevNode = new ListNode();
        
        prevNode = head;
        currentNode = head.next;
        
        if (currentNode.next != null) {
            nextNode = currentNode.next;
        } else {
            // two
            currentNode.next = prevNode;
            prevNode.next = null;
            return currentNode;
        }
        
        prevNode.next = null;
        
        while(currentNode.next != null) {
            // change direction of link
            currentNode.next = prevNode;
            // move one place forward on the linked list
            prevNode = currentNode;         
            currentNode = nextNode;
            nextNode = currentNode.next;
        }
        currentNode.next = prevNode;
        return currentNode;
    }
}
