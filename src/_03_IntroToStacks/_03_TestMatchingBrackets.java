package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<Boolean> brackets = new Stack<Boolean>();
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i)=='{') {
				brackets.push(false);
			}
		}
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i)=='}') {
				brackets.pop();
			}
		}
		if(brackets.size()==0&&b.charAt(0)!='}') {
			System.out.println("true");
		return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	}

}