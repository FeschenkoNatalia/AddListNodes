
public class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        System.out.print(l1.val + " ");
        System.out.print(l1.next.val + " ");
        System.out.print(l1.next.next.val+" ");
        System.out.println();

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.print(l2.val + " ");
        System.out.print(l2.next.val + " ");
        System.out.print(l2.next.next.val + " ");
        System.out.println();

        ListNode l3 = addTwoNumbers(l1, l2);
        System.out.print(l3.val + " ");
        System.out.print(l3.next.val + " ");
        System.out.print(l3.next.next.val + " ");
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int excess = 0;
        ListNode resultedListNode = new ListNode(0);
        ListNode temp = resultedListNode;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = excess + x + y;
            excess = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (excess > 0) {
            temp.next = new ListNode(excess);
        }
        return resultedListNode.next;
    }
}