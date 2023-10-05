/* 141. Linked List Cycle

Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Example 3:
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list. */

public class LeetCode_141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node.
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;      // Move slow pointer one step.
            fast = fast.next.next; // Move fast pointer two steps.

            if (slow == fast) {
                return true; // If there's a cycle, the pointers will meet.
            }
        }

        return false; // No cycle found.
    }

    public static void main (String[] args){
        // Create a linked list with a cycle
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head1.next = node2;
        node2.next = node0;
        node0.next = node4;
        node4.next = node2; // Creating a cycle

        LeetCode_141_LinkedListCycle cycleChecker = new LeetCode_141_LinkedListCycle();
        boolean hasCycle1 = cycleChecker.hasCycle(head1);
        System.out.println("Example 1: " + hasCycle1); // Output should be true

        // Create a linked list with a cycle
        ListNode head2 = new ListNode(1);
        ListNode node2_2 = new ListNode(2);

        head2.next = node2_2;
        node2_2.next = head2; // Creating a cycle

        boolean hasCycle2 = cycleChecker.hasCycle(head2);
        System.out.println("Example 2: " + hasCycle2); // Output should be true

        // Create a linked list without a cycle
        ListNode head3 = new ListNode(1);

        boolean hasCycle3 = cycleChecker.hasCycle(head3);
        System.out.println("Example 3: " + hasCycle3); // Output should be false
 
    }
}

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}
