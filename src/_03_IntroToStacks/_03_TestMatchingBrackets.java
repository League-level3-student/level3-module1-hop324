package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {
	public Stack<Character> characters = new Stack<Character>();
	public int open = 0;
	public int closed = 0;
	public char start;
	public String checker = "{";
	public String checkers = "}";
	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	@SuppressWarnings("unlikely-arg-type")
	private boolean doBracketsMatch(String b) {
		start = b.charAt(0);
		for(int i = 0; i < b.length(); i++) {
			characters.push(b.charAt(i));
			System.out.println(characters.toString());
		}
		for(int i = 0; i < characters.size(); i++) {
			System.out.println(characters.get(i));
			if(characters.get(i) == checker.charAt(0)) {
				open++;
				System.out.println(open);
				System.out.println("yowzers");
			}
			else if(characters.get(i) == checkers.charAt(0)) {
				closed++;
				System.out.println(closed);
				System.out.println("Yikes");
			}
			
		}
		if(open == closed && start == checker.charAt(0)) {
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	}

}