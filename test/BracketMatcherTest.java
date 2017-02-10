import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

public class BracketMatcherTest {

    @Test
    public void returnTrueForPairedSquareBrackets() {
        List<Character> openBrackets = getOpenBrackets();
        List<Character> closedBrackets = getClosedBrackets();
        Character bracketOne = '[';
        Character bracketTwo = ']';
        List<Character> brackets = new ArrayList<>();
        brackets.add(bracketOne);
        brackets.add(bracketTwo);
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack, openBrackets, closedBrackets);
        assertTrue(bracketMatcher.areBracketsMatched(brackets));
    }

    @Test
    public void returnTrueForPairedAndNestedSquareBrackets() {
        List<Character> openBrackets = getOpenBrackets();
        List<Character> closedBrackets = getClosedBrackets();
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
        BracketMatcher bracketMatcher = new BracketMatcher(stack, openBrackets, closedBrackets);
        assertTrue(bracketMatcher.areBracketsMatched(brackets));
    }

    private List<Character> getOpenBrackets() {
        List<Character> openBrackets = new ArrayList<>();
        openBrackets.add('{');
        openBrackets.add('[');
        openBrackets.add('(');
        return openBrackets;
    }

    private List<Character> getClosedBrackets() {
        List<Character> closedBrackets = new ArrayList<>();
        closedBrackets.add('}');
        closedBrackets.add(']');
        closedBrackets.add(')');
        return closedBrackets;
    }
}