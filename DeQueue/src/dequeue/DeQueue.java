package dequeue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DeQueue {
	public static void main(String[] args) {
		Deque<Integer> dq=new LinkedBlockingDeque<>();
		
		dq.offer(1);
		dq.offer(2);
		dq.offer(3);
		dq.offer(4);
		dq.offer(5);
		dq.offer(6);
		
		for(Integer elt:dq) {
			System.out.println(elt);
		}
		System.out.println("**********\tAdd at first place:\t**********");
		dq.addFirst(0);
		for(Integer elt:dq) {
			System.out.println(elt);
		}
		System.out.println("**********\tRemove at last:\t\t**********");
		dq.removeLast();
		for(Integer elt:dq) {
			System.out.println(elt);
		}
	}	
}
