public class Solution {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if(head == null || head.next == null)   return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = dummy;
        int len = 0;
        while(fast != null) {
            fast = fast.next;
            len ++;
        }
        k = k % len;

        fast = dummy;
        for(int i = 0; i < k; i ++) {
            fast = fast.next;
        }
        while(fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        return dummy.next;
    }
}