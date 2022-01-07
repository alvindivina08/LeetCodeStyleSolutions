package LeetCode.Easy;

public class RemoveDuplicatesFromSortedList {
//    https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    /* Given the head of a sorted linked list,
     * delete all duplicates such that each element
     * appears only once. Return the linked list sorted as well.
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode list = head;

        while(list.next != null) {
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;

    }

    public ListNode deleteDuplicatesRecursive(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }

}
