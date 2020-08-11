 public static int getCount(Node head)
    {
        //base case : if head.next = null return 1 ior head = null return 0;
        if(head==null){
            return 0;
        }
        if(head.next==null){
            return 1;
        }
        return 1 + getCount(head.next);
        
        
    }
