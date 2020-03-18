package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> yeet = new ArrayList<String>();
		//2. Add five Strings to your list
		yeet.add("Boo");
		yeet.add("Scareeeee");
		yeet.add("Spoooooky");
		yeet.add("Ghost");
		yeet.add("I dunno");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < yeet.size(); i++) {
			System.out.println(yeet.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for (String x : yeet) {
			System.out.println(x);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < yeet.size(); i++) {
			if(i%2 == 0) {
				System.out.println(yeet.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i = yeet.size(); i > 0; i--) {
			System.out.println(yeet.get(i-1));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = yeet.size(); i > 0; i--) {
			for(int e = 0; e < yeet.get(i-1).length(); e++) {
				if(yeet.get(i-1).charAt(e) == 'e') {
					System.out.println(yeet.get(i-1));
					
				}
			}
		}
	}
}
