import org.junit.Test;

import static org.junit.Assert.*;

public class BracketMatcherTest {
    @Test
    public void returnTrueIfTheStringHasAllBracketsMatched() {
        String inputString="{}";
        BracketMatcher bracketMatcher=new BracketMatcher();
        assertTrue(bracketMatcher.areBracketsMatched(inputString));
    }
}