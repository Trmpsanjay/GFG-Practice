class Solution {
     Node findmid(Node head){
        if(head==null)
            return head;
        Node slow=head;
        Node fast=head;
        Node prev=head;;
        while(fast!=null && fast.next != null && fast.next.next !=null ){
            // prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    
    public Node insertInMid(Node head, int data){
        //edge case if head is null or or only one element
        if(head==null){
            Node newNode = new Node(data);
            return newNode;
        }
        // create a new node
         Node newNode = new Node(data);
         //find mid node
        Node mid = findmid(head);
        //System.out.println(mid.data);
        //store the remaining link in new variable
        Node temp = mid.next;
        //link them
        mid.next = newNode;
        newNode.next = temp;
        return head;
        
       
    }
}
