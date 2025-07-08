class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k < 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        // Check if there are at least k nodes left in the list
        int count = 0;
        ListNode temp = head;
        while (count < k && temp != null) {
            temp = temp.next;
            count++;
        }
        if (count < k) {
            return head; // Not enough nodes to reverse, return the original head
        }

        // Reverse k nodes
        count = 0;
        while (count < k && current != null) {
            ListNode next = current.next; // Save the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to the next node
            count++;
        }

        // Now prev is the new head of the reversed group
        if (head != null) {
            head.next = current; // Connect the previous group to the next part
        }

        // Recursively call for the next groups
        if (current != null) {
            head.next = reverseKGroup(current, k);
        }

        return prev; // Return the new head of the reversed list
    }
}
