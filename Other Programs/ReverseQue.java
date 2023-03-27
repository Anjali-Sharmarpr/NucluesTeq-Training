package Queue;

import java.util.*;

//reverse the elements of queue

public class ReverseQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
ArrayDeque<Integer> que = new ArrayDeque<Integer>();
ArrayDeque<Integer> tempQue =  new ArrayDeque<Integer>();

		
		//offer adds element
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		que.offer(50);
		
		System.out.println(que);
		
		while(!que.isEmpty()) {
			tempQue.addFirst(que.peek()); //separte que adding elements from starting 
			que.poll();
		}
		
		
		System.out.println(tempQue);
		
		
	}

}
