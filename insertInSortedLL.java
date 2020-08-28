// { Driver Code Starts

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution g = new Solution();
            head = g.sortedInsert(head,k);
            
            printList(head); 
            t--;
        }
    } 
} 
// } Driver Code Ends



/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        if(key<=head1.data){
            Node newNode = new Node(key);
            newNode.next = head1;
            return newNode;
        }
        Node temp = head1;
        Node prev = head1;
        boolean inserted = false;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
            if(prev.data<key && temp.data >= key ){
                Node newNode = new Node(key);
                prev.next = newNode;
                newNode.next = temp;
                inserted = true;
                break;
            }
        }
        if(!inserted){ // case of adding in last
        Node newNode = new Node(key);
            temp.next = newNode;
        }
        return head1;
        
    }
}
