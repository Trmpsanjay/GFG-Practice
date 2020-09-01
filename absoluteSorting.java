
// can be solved in o(n) just traverse all the data and if the data is negative append it in first and update head
// above is the proper soln







class GfG
{
    public static Node findMid(Node head){
        if(head == null)
            return head;
        if(head.next == null)
            return head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static Node merge(Node head1 , Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node headNew = null;
        Node tailNew = null;
        while(t1 !=null && t2 != null){
            if(t1.data<t2.data){
                if(headNew==null){
                    headNew = t1;
                    tailNew = t1;
                    t1 = t1.next;
                }
                else{
                    tailNew.next = t1;
                    tailNew = t1;
                    t1 = t1.next;
                }
            }else{
                if(headNew==null){
                    headNew = t2;
                    tailNew = t2;
                    t2 = t2.next;
                }
                else{
                    tailNew.next = t2;
                    tailNew = t2;
                    t2 = t2.next;
                }
                
            }
            
            
        }
        if( t1 != null){
            tailNew.next = t1;
        }
        if( t2 != null){
            tailNew.next = t2;
        }
        return headNew;

    }
    static Node mergeSort(Node head)
    {
        if(head == null)
            return head;
        if(head.next == null)
            return head;
        Node  mid = findMid(head);
        Node h2 = mid.next;
        mid.next = null;
        Node part1 = mergeSort(head);
        Node part2 = mergeSort(h2);
        Node merge = merge(part1,part2);
        return merge;
    }
	Node sortedList(Node head)
	{
		return mergeSort(head);
	}
}
