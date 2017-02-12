import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BracketMatcherTest {
    @Test
    public void returnTrueForPairedSquareBrackets() {
        Map<Character, Character> bracketMapping = getBracketMapping();
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack, bracketMapping);
        String input = "[]";
        assertTrue(bracketMatcher.areBracketsMatched(input));
    }

    @Test
    public void returnFalseForUnPairedBrackets() {
        Map<Character, Character> bracketMapping = getBracketMapping();
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack, bracketMapping);
        String input = "[[";
        assertFalse(bracketMatcher.areBracketsMatched(input));
    }

    @Test
    public void returnFalseForUnOrderedBrackets() {
        Map<Character, Character> bracketMapping = getBracketMapping();
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack, bracketMapping);
        String input = "}{";
        assertFalse(bracketMatcher.areBracketsMatched(input));
    }

    @Test
    public void returnTrueForPairedAndNestedBrackets() {
        Map<Character, Character> bracketMapping = getBracketMapping();
        String input = "}{";
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack, bracketMapping);
        assertFalse(bracketMatcher.areBracketsMatched(input));
    }

    @Test
    public void returnFalseForPairedAndIncorrectlyNestedBrackets() {
        Map<Character, Character> bracketMapping = getBracketMapping();
        String input = "[({]})";
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack, bracketMapping);
        assertFalse(bracketMatcher.areBracketsMatched(input));
    }

    @Test
    public void returnTrueForValidMathExpression() {
        Map<Character, Character> bracketMapping = getBracketMapping();
        String input = "(((185+223.85)*15)-543)/2";
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack, bracketMapping);
        assertTrue(bracketMatcher.areBracketsMatched(input));
    }

    private Map<Character, Character> getBracketMapping() {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put(')', '(');
        return brackets;
    }
}