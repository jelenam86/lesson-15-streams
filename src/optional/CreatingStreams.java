package optional;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class CreatingStreams {
	public static void main(String[] args) {
		//1. Create a stream out of the following collections.
		String[] strArr = {"one", "two", "three", "four"};
		
		Arrays.stream(strArr).forEach(System.out::println);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		intList.stream().forEach(System.out::println);
		
		Stack<Random> randStack = new Stack<Random>();
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		
		randStack.stream().forEach(System.out::println);
		
		ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
		dQueue.push(0.0);
		dQueue.push(1.0);
		dQueue.push(2.0);
		dQueue.push(3.0);
		
		dQueue.stream().forEach(System.out::println);
	}
}
