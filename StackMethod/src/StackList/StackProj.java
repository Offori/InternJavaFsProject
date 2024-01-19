package StackList;

import java.util.Stack;

public class StackProj {
	public static void main(String[] args) {
		Stack<Integer> demo=new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		
		for(Integer temp: demo) {
			System.out.println(temp);
		}
		System.out.println("**********************************************************");
		System.out.println(demo.peek());//shows last element
		System.out.println("check if it's empty");
		if(demo.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack is not empty");
		}
		System.out.println("check if a random element exists");
		System.out.println(demo.search(2));
	}
}

