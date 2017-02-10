import java.util.List;
import java.util.Map;
import java.util.Stack;

class BracketMatcher {
    private final Stack stack;
    private final Map<Character,Character> bracketMapping;
    BracketMatcher(Stack stack, Map<Character,Character> brackets) {
        this.stack = stack;
        this.bracketMapping = brackets;
    }

    boolean areBracketsMatched(List<Character> brackets) {
        for (Character bracket:brackets) {
            if(bracketMapping.containsValue(bracket)){
                stack.push(bracket);
            }
            else {
                Character poppedBracket =(Character)stack.pop();
                if(bracketMapping.get(bracket).equals(poppedBracket)) {
                    return true;
                }
                else
                    return false;
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}
