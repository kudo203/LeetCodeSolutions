
public class ReverseLinkList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode reverseList(ListNode head){
        ListNode ans = null;
        while(head!=null){
            ListNode new1 = new ListNode(head.val);
            new1.next = ans;
            ans = new1;
            head = head.next;
        }
        return ans;
    }
}
