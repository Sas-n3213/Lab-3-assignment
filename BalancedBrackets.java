package com.lab3;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the bracket sequence:");
		String sequence = sc.nextLine();
		
		if (balancingBrackets(sequence)) {
			System.out.println("The entered String has balanced brackets.");
			
		}
		else {
			System.out.println("The entered String doesn't contain balanced brackets.");
		}
	sc.close();
	}


	 static boolean balancingBrackets(String sequence) {
		
	Stack <Character> stack = new Stack <Character>();
	
	for (int i=0; i<sequence.length(); i++) {
		char x = sequence.charAt(i);
	
		if (x=='('|| x=='['|| x=='{') {
			stack.push(x);
			continue;
		}
		if (stack.isEmpty()) 
			return false;
			
		
		char check;
		
		switch (x){
		case ')':
			check=stack.pop();
			
			if (check=='{'|| check=='[') 
				return false;
				break;
			
		case '}':
			
			check=stack.pop();
			
			if (check=='('|| check=='[')
				return false;
				break;
			
			
		case ']':
			
			check=stack.pop();
			
			if (check=='('|| check=='{')
				return false;
				break;
		}
	}
			
				return (stack.isEmpty());	
	}
}
	
	

	
