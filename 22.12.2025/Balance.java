import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        String s = "{[()]}";
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(')
                stack.push(c);
            else {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char top = stack.pop();
                if ((c == '}' && top != '{') ||
                    (c == ']' && top != '[') ||
                    (c == ')' && top != '(')) {
                    isBalanced = false;
                    break;
                }
            }
        }
        System.out.println(isBalanced && stack.isEmpty() ? "Balanced" : "Not Balanced");
    }
}
