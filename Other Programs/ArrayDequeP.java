package Queue;

import java.util.ArrayDeque;

//implementing Queue
//first in first out

public class ArrayDequeP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		
		//offer adds element
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		que.offer(50);
		
		System.out.println(que);
		
		que.poll(); //return and remove the elements
		System.out.println(que);
		
		System.out.println(que.peek());   //returns the head element
		
		que.addLast(60);   //adding element at last
		System.out.println(que);
		
		que.addFirst(10);
		System.out.println(que);
		
		System.out.println(que.getFirst());
		System.out.println(que.getLast());
		
		
	}
	

}
