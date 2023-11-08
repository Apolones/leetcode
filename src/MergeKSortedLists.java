//You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//
//Merge all the linked-lists into one sorted linked-list and return it.

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        list1.next = l4;
        list2.next = l5;
        ListNode[] lists = new ListNode[]{list1, list2};
        Solution.mergeKLists(lists);
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
        public static ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> queue = new PriorityQueue<>((x, y) -> x.val - y.val);
            for (ListNode current : lists)
                if (current != null) queue.add(current);
            ListNode head = new ListNode();
            ListNode iterrator = head;
            while (!queue.isEmpty()) {
                iterrator.next = queue.poll();
                iterrator = iterrator.next;
                if (iterrator.next != null) queue.add(iterrator.next);
            }
            return head.next;
        }
    }
}
