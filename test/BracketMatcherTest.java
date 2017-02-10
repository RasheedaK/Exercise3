import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BracketMatcherTest {
    @Test
    public void returnTrueForPairedSquareBrackets() {
        Map<Character,Character> bracketMapping = getBracketMapping();
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack,bracketMapping);
        Character bracketOne = '[';
        Character bracketTwo = ']';
        List<Character> brackets = new ArrayList<>();
        brackets.add(bracketOne);
        brackets.add(bracketTwo);
        assertTrue(bracketMatcher.areBracketsMatched(brackets));
    }

    @Test
    public void returnTrueForPairedAndNestedSquareBrackets() {
        Map<Character,Character> bracketMapping = getBracketMapping();
        Character bracketOne = '[';
        Character bracketTwo = '{';
        Character bracketThree = '}';
        Character bracketFour = ']';
        List<Character> brackets = new ArrayList<>();
        brackets.add(bracketOne);
        brackets.add(bracketTwo);
        brackets.add(bracketThree);
        brackets.add(bracketFour);
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack,bracketMapping);
        assertTrue(bracketMatcher.areBracketsMatched(brackets));
    }

    private Map<Character,Character> getBracketMapping() {
        Map<Character,Character> brackets = new HashMap<>();
        brackets.put('}','{');
        brackets.put(']','[');
        brackets.put(')','(');
        return brackets;
    }
}