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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            
        // O(n) solution
        // run to end of list, get list length - O(n)
        // subtract n - O(1)
        // run to end of list minus n - O(n)
        // delete item - O(1)
        
        int listLength = 0;
        ListNode deleteNode = new ListNode();
        ListNode nextNode = new ListNode();
        ListNode currentNode =  new ListNode();
        currentNode = head;
        
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            listLength++;
        }
        
        if (listLength < 1) {
            return null;
        }
        
        currentNode = head;
        listLength -= n; 
        
        if (listLength < 0) {
            head = head.next;
        }
        
        for (int i = 0; i < listLength; i++) {
            currentNode = currentNode.next;
        }
        
        deleteNode = currentNode.next;
        nextNode = deleteNode.next;
        
        currentNode.next = nextNode;
        
        return head;
    }
}
