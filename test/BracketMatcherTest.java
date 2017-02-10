import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class BracketMatcherTest {
    @Test
    public void returnTrueIfTheStringHasAllBracketsMatched() {
        String inputString = "{}";
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack);
        assertTrue(bracketMatcher.areBracketsMatched(inputString));
    }
}