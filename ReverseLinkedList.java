class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head, null);
    }
    private ListNode helper(ListNode cur, ListNode newHead) {
        if (cur == null)    return newHead;
        ListNode next = cur.next;
        cur.next = newHead;
        return helper(next, cur);
    }

}