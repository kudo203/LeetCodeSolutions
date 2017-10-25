public class IsPalindrome {

    public static boolean isPalindrome(ListNode head){
        ListNode reversal = reverse(head);
        while(reversal!=null){
            if(reversal.val != head.val){
                return false;
            }

            reversal = reversal.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode header){
        ListNode ans = null;

        while(header!=null){
            ListNode newNode = new ListNode(header.val);
            newNode.next = ans;
            ans = newNode;
            header = header.next;
        }

        return ans;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
