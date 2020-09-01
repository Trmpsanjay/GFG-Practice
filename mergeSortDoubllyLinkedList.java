// { Driver Code Starts


import java.util.*;
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next, prev;
    Node(int key)
    {
        data = key;
        next = prev = null;
    }
}

class Driverclass
{
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int a1 = sc.nextInt();
	        Node head = new Node(a1);
	        Node temp = head;
	        
	        for (int i = 1;i < n;i++)
	        {
	            int a = sc.nextInt();
	            Node n1 = new Node(a);
	            n1.prev = temp;
	            temp.next = n1;
	            temp = n1;
	        }
	        
	        head = new LinkedList().sortDoubly(head);
	        printList(head);
	    }
	}
	public static void printList(Node node)
	{
	    Node temp = node;
	    while(node != null)
	    {
	        System.out.print(node.data + " ");
	        temp = node;
	        node = node.next;
	    }
	    System.out.println();
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.prev;
	    }
	    System.out.println();
	}
}
// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class LinkedList
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
        slow.prev = null;
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
                    headNew.prev = null;
                    tailNew = t1;
                    t1 = t1.next;
                }
                else{
                    t1.prev = tailNew;
                    tailNew.next = t1;
                    tailNew = t1;
                    t1 = t1.next;
                }
            }else{
                if(headNew==null){
                    headNew = t2;
                    headNew.prev = null;
                    tailNew = t2;
                    t2 = t2.next;
                }
                else{
                    t2.prev = tailNew;
                    tailNew.next = t2;
                    tailNew = t2;
                    t2 = t2.next;
                }
                
            }
            
            
        }
        if( t1 != null){
            t1.prev = tailNew ;
            tailNew.next = t1;
        }
        if( t2 != null){
            t2.prev = tailNew;
            tailNew.next = t2;
        }
        return headNew;

    }
    static Node sortDoubly(Node head)
    {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        Node mid = findMid(head);
        Node h2 =  mid.next;
        mid.next = null;
        h2.prev = null;
        
        Node part1 = sortDoubly(head);
        Node part2 = sortDoubly(h2);
        return merge(part1,part2);
    }
}
