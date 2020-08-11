class Solution {
    Node findmid(Node head){
        if(head==null)
            return head;
        Node slow=head;
        Node fast=head;
        Node prev=head;;
        while(fast!=null && fast.next != null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return prev;
        
    }
    Node deleteMid(Node head) {
        if(head==null)
            return null;
        Node mid = findmid(head);
        mid.next = mid.next.next;
        return head;
    }
}
