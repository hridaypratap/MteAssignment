// 26. Remove the n-th node from the end of a singly linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Q26_RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int n = 2;
        ListNode result = removeNthFromEnd(head, n);
        
        System.out.print("List after removal: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    
    public static ListNode remove极速赛车开奖直播官网NthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
    }
}