//Given the head of a linked list, remove the nth node from the end of the list and return its head.

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 5; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        current = head;
        current = Solution.removeNthFromEnd(head, 4);
        for (int i = 0; i < 4; i++) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static class ListNode {
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
        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode iterrator = head;
            ListNode delete = head;
            for (int i = 0; i < n; i++) iterrator = iterrator.next;
            if (iterrator == null) return head.next;
            while (iterrator.next != null) {
                iterrator = iterrator.next;
                delete = delete.next;
            }
            delete.next = delete.next.next;
            return head;
        }
    }
}
