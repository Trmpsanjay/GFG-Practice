// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
    
   
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    if(s.isEmpty()) {
		    return s;
		   }
		
		Stack<Integer> s1 = new Stack<>();
		int topElememt = 0;
		while (!s.isEmpty()) {
		    topElememt = s.pop();
		    while(!s1.isEmpty() && topElememt < s1.peek()) {
		            s.push(s1.pop());
		    }
		    s1.push(topElememt);
		}
		
		return s1;
	}
}
