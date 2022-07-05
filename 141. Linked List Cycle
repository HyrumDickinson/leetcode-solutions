/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // run through the list for more than the max number of nodes in the list
        // if there's still a next node, then output is true
        // else, output is false
        if (head == null) {
            return false;
        }
        boolean output = true;
        ListNode currentNode = new ListNode();
        currentNode = head;
        int i = 0;
        while (i < 10000) {
            if (currentNode.next == null) {
                return false;
            } else {
                currentNode = currentNode.next;
                i++;
            }
        }
        return output;
    }
}
