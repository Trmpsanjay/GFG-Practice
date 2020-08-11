 Node reverseList(Node head)
    {
        //base case : if single or null then return that
        if(head==null || head.next==null){
            return head;
        }
        //storing address of next pointer to 
        Node temp = head.next;
        //calling recursive function for remaining job
        Node finalHead = reverseList(head.next);
        //connect the first to last and make it next to null
        temp.next =head;
        head.next = null;
        return finalHead;
    }
