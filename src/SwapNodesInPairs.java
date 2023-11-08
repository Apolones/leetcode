//Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

public class SwapNodesInPairs {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode iterator = new ListNode(0, head);
            head = head.next;
            while (iterator.next != null && iterator.next.next != null) {
                ListNode temp1;
                ListNode temp2;

                temp1 = iterator.next;
                temp2 = iterator.next.next;

                temp1.next = temp2.next;
                temp2.next = temp1;
                iterator.next = temp2;

                iterator = temp1;
            }
            return head;
        }
    }
}
