// 27. Find the node where two singly linked lists intersect
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Q27_IntersectionTwoLinkedLists {
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);
        
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;
        
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;
        
        ListNode intersection = getIntersectionNode(headA, headB);
        System.out.println("Intersection node value: " + (intersection != null ? intersection.val : "null"));
    }
    
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
}