/* 160. Intersection of Two Linked Lists 
Given the heads of two singly linked-lists and , return the node at which the two lists intersect. If the two linked lists have no intersection at all, return .headAheadBnull
For example, the following two linked lists begin to intersect at node :c1
The test cases are generated such that there are no cycles anywhere in the entire linked structure.
Note that the linked lists must retain their original structure after the function returns.

Custom Judge:

The inputs to the judge are given as follows (your program is not given these inputs):
intersectVal - The value of the node where the intersection occurs. This is if there is no intersected node.0
listA - The first linked list.
listB - The second linked list.
skipA - The number of nodes to skip ahead in (starting from the head) to get to the intersected node.listA
skipB - The number of nodes to skip ahead in (starting from the head) to get to the intersected node.listB
The judge will then create the linked structure based on these inputs and pass the two heads, and to your program. If you correctly return the intersected node, then your solution will be accepted.headAheadB

Example 1:
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.

Example 2:
Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'
Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.

Example 3:
Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection
Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.

*/

public class LeetCode_160_IntersectionOfTwoLinkedLists {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }

    int count1 = 0, count2 = 0;
    ListNode a = headA;
    ListNode b = headB;

    while (a != null) {
      count1++;
      a = a.next;
    }

    while (b != null) {
      count2++;
      b = b.next;
    }

    while (count1 > count2) {
      count1--;
      headA = headA.next;
    }

    while (count2 > count1) {
      count2--;
      headB = headB.next;
    }

    while (headA != headB) {
      headA = headA.next;
      headB = headB.next;
    }

    return headA;
  }

  public static void main(String args[]) {
    LeetCode_160_IntersectionOfTwoLinkedLists solution = new LeetCode_160_IntersectionOfTwoLinkedLists();

    // Test Case 1: Intersected at '8'
    ListNode commonNode1 = new ListNode(8);
    ListNode listA1 = new ListNode(4);
    listA1.next = new ListNode(1);
    listA1.next.next = commonNode1;
    listA1.next.next.next = new ListNode(4);
    listA1.next.next.next.next = new ListNode(5);

    ListNode listB1 = new ListNode(5);
    listB1.next = new ListNode(6);
    listB1.next.next = new ListNode(1);
    listB1.next.next.next = commonNode1;
    listB1.next.next.next.next = new ListNode(4);
    listB1.next.next.next.next.next = new ListNode(5);

    ListNode result1 = solution.getIntersectionNode(listA1, listB1);
    System.out.println("Test Case 1: Intersected at '8'");
    System.out.println("Result: " + result1.val);

    // Test Case 2: Intersected at '2'
    ListNode commonNode2 = new ListNode(2);
    ListNode listA2 = new ListNode(1);
    listA2.next = new ListNode(9);
    listA2.next.next = new ListNode(1);
    listA2.next.next.next = commonNode2;
    listA2.next.next.next.next = new ListNode(4);

    ListNode listB2 = new ListNode(3);
    listB2.next = commonNode2;
    listB2.next.next = new ListNode(4);

    ListNode result2 = solution.getIntersectionNode(listA2, listB2);
    System.out.println("\nTest Case 2: Intersected at '2'");
    System.out.println("Result: " + result2.val);

    // Test Case 3: No intersection
    ListNode listA3 = new ListNode(2);
    listA3.next = new ListNode(6);
    listA3.next.next = new ListNode(4);

    ListNode listB3 = new ListNode(1);
    listB3.next = new ListNode(5);

    ListNode result3 = solution.getIntersectionNode(listA3, listB3);
    System.out.println("\nTest Case 3: No intersection");
    System.out.println(
      "Result: " + (result3 == null ? "No intersection" : result3.val)
    );
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
