package Lec43;

public class SortList {

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

   private static ListNode sort(ListNode head){

        if(head==null || head.next==null){
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode nextOfMid = mid.next;
        mid.next = null;
        ListNode l1 = sort(head);
        ListNode l2 = sort(nextOfMid);
        return mergeLists(l1,l2);
   }

   private static ListNode mergeLists(ListNode head1,ListNode head2){

        if(head1==null && head2!=null) return head2;
        else if(head2==null && head1!=null) return head1;

        ListNode master = new ListNode();
        ListNode temp = master;
        while(head1!=null && head2!=null){

            if(head1.val< head2.val){
                master.next = head1;
                head1 = head1.next;
            }else{
                master.next = head2;
                head2 = head2.next;
            }
        }

        if(head1!=null){
            master.next = head1;
        }

        if(head2!=null){
            master.next = head2;
        }

        return temp.next;

   }

   private static ListNode middleNode(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

   }


}
