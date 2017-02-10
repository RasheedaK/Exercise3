import java.util.List;
import java.util.Stack;

class BracketMatcher {
    private final Stack stack;
    private final List<Character> openBrackets;
    private final List<Character> closedBrackets;
    BracketMatcher(Stack stack, List<Character> openBrackets, List<Character> closedBrackets) {
        this.stack = stack;
        this.openBrackets = openBrackets;
        this.closedBrackets = closedBrackets;
    }

    boolean areBracketsMatched(List<Character> brackets) {
       return true;
    }
}
