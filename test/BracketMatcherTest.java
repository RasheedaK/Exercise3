import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

public class BracketMatcherTest {
    @Test
    public void returnTrueIfTheStringHasAllBracketsMatched() {
        Bracket bracketOne=new Bracket('{');
        Bracket bracketTwo=new Bracket('}');
        List<Bracket> brackets=new ArrayList<>();
        brackets.add(bracketOne);
        brackets.add(bracketTwo);
        Stack stack = new Stack();
        BracketMatcher bracketMatcher = new BracketMatcher(stack);
        assertTrue(bracketMatcher.areBracketsMatched(brackets));
    }
}