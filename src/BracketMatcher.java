import java.util.ArrayList;
import java.util.List;
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
        List<Character> brackets = normalizeInput(inputString);
        for (Character bracket : brackets) {
            if (bracketMapping.containsValue(bracket)) {
                stack.push(bracket);
            } else {
                return testMatching(bracket);
            }
        }
        return isStackEmpty();
    }

    private List<Character> normalizeInput(String inputString) {
        String input = removeNonBraces(inputString);
        List<Character> brackets = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            brackets.add(input.charAt(i));
        }
        return brackets;
    }

    private String removeNonBraces(String inputString) {
        System.out.println(inputString);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < inputString.length(); i++) {
            if (bracketMapping.containsValue(inputString.charAt(i)) || bracketMapping.containsKey(inputString.charAt(i))) {
                stringBuffer.append(inputString.charAt(i));
            }
        }
        return new String(stringBuffer);
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
}
