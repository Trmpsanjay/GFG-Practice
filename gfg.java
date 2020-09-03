// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

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
}


