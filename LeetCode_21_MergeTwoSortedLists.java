/* 21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of 
the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 */

public class LeetCode_21_MergeTwoSortedLists {

  static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode resultList = new ListNode(0);
    ListNode current = resultList;

    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        current.next = list1;
        list1 = list1.next;
      } else {
        current.next = list2;
        list2 = list2.next;
      }
      current = current.next;
    }

    if (list1 != null) {
      current.next = list1;
    } else {
      current.next = list2;
    }

    return resultList.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    // Call the addTwoNumbers method and print the result
    ListNode result = mergeTwoLists(l1, l2);
    while (result != null) {
      System.out.print(result.val + " ");
      result = result.next;
    }

  }
}
