package QueueJav;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class useOfOfferPollPeek {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedBlockingQueue<>(5);
		
		System.out.println("*******************offer() operations*****************************");
		System.out.println("When operation is successful\t"+q.offer(1));
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.offer(6);
		
		System.out.println("When operation is failed\t"+q.offer(6));
		
		for(Integer elt:q) {
			System.out.println(elt);
		}
		
		
		System.out.println("\n*******************poll() operations*****************************");
		Queue<Integer> q1=new LinkedBlockingQueue<>(5);
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		q1.offer(4);
		q1.offer(5);
		q1.offer(6);
		for(Integer elt:q1) {
			System.out.println(elt);
		}

		System.out.println("**************************************");
		System.out.println("remove first element\t"+q1.poll());
		for(Integer elt:q1) {
			System.out.println(elt);
		}
		
		System.out.println("\n*******************peek() operations*****************************");
		Queue<Integer> q2=new LinkedBlockingQueue<>(5);
		q2.offer(1);
		q2.offer(2);
		q2.offer(3);
		q2.offer(4);
		q2.offer(5);
		q2.offer(6);
		for(Integer elt:q2) {
			System.out.println(elt);
		}
		System.out.println("\n\nPeek element:\t"+q.peek());

	}
}
