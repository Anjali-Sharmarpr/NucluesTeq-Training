package Queue;

//reverse k elements of queue
/*
 * method 1 - using a secondary queue
 * method 2 - using a stack
 */

import java.util.*;


class Reverse{
	public void ReverseKQue(int k,ArrayDeque<Integer> temp) {
		
		//method 1
	        
		ArrayDeque<Integer> que2 =  new ArrayDeque<Integer>(); //secondary array to put elements
		
		//putting reversely first k elements into secondary queue
		
		for(int i=0;i<k;i++) { 
			que2.addFirst(temp.peek());  //due to addFirst() - elements are inserting in reverse way
			temp.poll();
		}
		//putting the remaining elemnts into the secondary queue
		
		while(!temp.isEmpty()) {
			que2.add(temp.peek());
			temp.poll();
		}
		
		System.out.println(que2);
    }
	public void ReverseKQueStack(int k,ArrayDeque<Integer> temp) {
		
		//method 2
		
		Stack<Integer> sck= new Stack<Integer>();
		
		for(int i=0;i<k;i++) { //adding elements of queue (till k elements) into stack
			sck.push(temp.peek());
			temp.poll();
		}
		
		//adding the stack elements at back of queue (rear)
		
		//System.out.println(sck);
		
		while(!sck.isEmpty()) {
			temp.addLast(sck.peek());
			sck.pop();
		}
		
		for(int i=1;i<=(temp.size()-k);i++) {
			temp.addLast(temp.peek());
			temp.poll();
		}
		System.out.println(temp);
	}
}

public class ReverseKQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner s = new Scanner(System.in);
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		
		System.out.println("Enter no of elements ");
		int n= s.nextInt();
		
        System.out.println("Enter elements");
				
				for(int j=0;j<n;j++) {
					int e=s.nextInt();
					que.offer(e);
				}
		
		System.out.println(que);	
		
	    System.out.println("Enter the value of k");
		int k=s.nextInt();
				
				
				Reverse r= new Reverse();
				
				System.out.println("After Reversing :- ");
								
				System.out.println("By method 1 -  queue & queue");
				
		        r.ReverseKQue(k,que);
		        
         System.out.println("Enter elements");
				
				for(int j=0;j<n;j++) {
					int e=s.nextInt();
					que.offer(e);
				}
				
		System.out.println(que);
		
		        System.out.println("By method 2 - queue & stack");
		      
				r.ReverseKQueStack(k, que);
		        
	}

}
