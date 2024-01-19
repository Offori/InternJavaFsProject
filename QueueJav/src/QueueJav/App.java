package QueueJav;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedBlockingQueue<>(5);
		try {
			q.remove();
		} catch (NoSuchElementException e1) {
			// TODO Auto-generated catch block
			System.out.println("Queue is empty");
		}
		try {
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(4);
			q.add(5);
			q.add(6);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			System.out.println("Queue is full. " + e);
		}
		System.out.println("Show the first element of the queue: \n"+"'"+q.element()+"'"+"\n\n");
		System.out.println("Remove first element\t"+q.remove());
		System.out.println("Show the first after previous first element of the queue: \n"+"'"+q.element()+"'"+"\n\n");
		
		for(Integer elt:q) {
			System.out.println(elt);
		}
		//ArrayblokingQueue
		System.out.println("******************************************");
		Queue<Integer> q1=new ArrayBlockingQueue<>(5);
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		
		for(Integer elt:q1) {
			System.out.println(elt);
		}
	}
}
