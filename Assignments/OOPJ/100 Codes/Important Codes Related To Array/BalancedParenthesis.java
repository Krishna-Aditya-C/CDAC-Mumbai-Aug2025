import java.util.Stack;

class BalancedParenthesis {
    static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp = "{[()]}";
        System.out.println(isBalanced(exp) ? "Balanced" : "Not Balanced");
    }
}
