package ua.skorobahatyi.tasks_from_leetcode.listnode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {


        ListNode head5 = new ListNode(3);
        ListNode head4 = new ListNode(3, head5);
        ListNode head3 = new ListNode(2, head4);
        ListNode head2 = new ListNode(1, head3);
        ListNode head = new ListNode(1, head2);

        System.out.println(deleteDuplicates(head));
    }

    private static ListNode deleteDuplicates(ListNode head) {
        ListNode headNew = new ListNode();
        headNew.val = head.val;
        while (head.next != null) {
            if (head.val == headNew.val) {
                head = head.next;
            } else {
                headNew.next.val = head.val;
                headNew = headNew.next;
                head = head.next;
            }

        }

        return headNew;
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}


