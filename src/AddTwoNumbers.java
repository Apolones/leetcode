//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
//and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int overflow = 0;
            ListNode headResult = new ListNode();
            ListNode currentResult = headResult;
            while (l1 != null || l2 != null) {
                if (l1 == null) l1 = new ListNode(0);
                if (l2 == null) l2 = new ListNode(0);
                currentResult.val = l1.val + l2.val + overflow;
                overflow = 0;
                if (currentResult.val >= 10) {
                    currentResult.val %= 10;
                    overflow = 1;
                }
                l1 = l1.next;
                l2 = l2.next;
                if (l1 != null || l2 != null) {
                    ListNode newList = new ListNode();
                    currentResult.next = newList;
                    currentResult = newList;
                }

            }
            if (overflow != 0) currentResult.next = new ListNode(overflow);
            return headResult;
        }
    }
}
