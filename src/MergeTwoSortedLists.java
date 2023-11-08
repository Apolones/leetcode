//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//Return the head of the merged linked list.

public class MergeTwoSortedLists {
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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode merge = new ListNode();
            ListNode head = merge;
            while (list1 != null || list2 != null) {
                if (list1 != null & list2 != null)
                    if (list1.val > list2.val) {
                        merge.next = new ListNode(list2.val);
                        merge = merge.next;
                        list2 = list2.next;
                    } else {
                        merge.next = new ListNode(list1.val);
                        merge = merge.next;
                        list1 = list1.next;
                    }
                else if (list1 != null) {
                    merge.next = new ListNode(list1.val);
                    merge = merge.next;
                    list1 = list1.next;
                } else if (list2 != null) {
                    merge.next = new ListNode(list2.val);
                    merge = merge.next;
                    list2 = list2.next;
                }
            }
            return head.next;
        }
    }
}
