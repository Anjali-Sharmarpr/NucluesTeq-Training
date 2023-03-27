package Queue;

//implementing priority queue

import java.util.PriorityQueue;
public class PriorityQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		PriorityQueue<Integer> que= new PriorityQueue<>();
		
		que.offer(100);
		que.offer(200);
		que.offer(300);
		que.offer(400);
		que.offer(500);
		
		System.out.println(que);
		
		que.poll();
		System.out.println(que);
		
		
	}

}
