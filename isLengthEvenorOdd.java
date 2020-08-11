int isLengthEvenorOdd(Node head1)
	{
	    //edge case
	    if(head1==null){
	        return 0;
	    }
	    if(head1.next==null){
	        return 1;
	    }
	   //checking if fast.next = null then odd and if fast.next.next = null then even
	   Node fast = head1;
	   Node slow = head1;
	  
	   while(fast.next!=null || fast.next.next!=null){
	       slow = slow.next;
	       fast = fast.next.next;
	       if(fast.next == null){
	            return 1;
	        }
	       if(fast.next.next==null){
	            return 0;
	        }
	   }
	   //return anythinh no problem
	   return 0;
	}
