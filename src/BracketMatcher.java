import java.util.Map;
import java.util.Stack;

class BracketMatcher {
    private final Stack stack;
    private final Map<Character, Character> bracketMapping;

    BracketMatcher(Stack stack, Map<Character, Character> brackets) {
        this.stack = stack;
        this.bracketMapping = brackets;
    }

    boolean areBracketsMatched(String inputString) {
        for (Character bracket : inputString.toCharArray()) {
            if (isBracket(bracket)) {
                if (bracketMapping.containsValue(bracket)) {
                    stack.push(bracket);
                } else {
                    return testMatching(bracket);
                }
            }
        }
        return isStackEmpty();
    }
    private boolean testMatching(Character bracket) {
        if (!isStackEmpty()) {
            Character poppedBracket = (Character) stack.pop();
            if (bracketMapping.get(bracket).equals(poppedBracket)) {
                return true;
            } else
                return false;
        } else
            return false;
    }

    private boolean isStackEmpty() {
        if (stack.empty())
            return true;
        else
            return false;
    }

    private boolean isBracket(Character bracket) {
        return bracketMapping.containsKey(bracket) || bracketMapping.containsValue(bracket);
    }
}
