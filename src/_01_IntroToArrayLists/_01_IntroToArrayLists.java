package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> s = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		s.add("cat");
		s.add("doge");
		s.add("bird");
		s.add("frog");
		s.add("lizard");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < s.size(); i++) {
			System.out.println("For loop: "+s.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for(String string: s) {
			System.out.println("For Each loop: "+string);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < s.size(); i++) {
			if(i%2==0) {
				System.out.println("Even numbered: "+s.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i = s.size()-1; i >= 0; i--) {
			System.out.println("Reverse order: "+s.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < s.size(); i++) {
			if(s.get(i).contains("e")) {
				System.out.println("Letter e: "+s.get(i));
			}
		}
	}
}
