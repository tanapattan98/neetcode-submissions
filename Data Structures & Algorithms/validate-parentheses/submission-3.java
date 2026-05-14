class Solution {

    private static List<Character> opening = List.of('(', '{', '[');
    private static List<Character> closing = List.of(')', '}', ']');
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : charArray) {
            stack.push(c);

            if (closing.contains(c)) {
                char top = stack.pop();

                if (stack.isEmpty()) {
                    return false;
                }

                char secondTop = stack.peek();
                if (secondTop == '(' && c == ')') {
                    stack.pop();
                } else if (secondTop == '{' && c == '}') {
                    stack.pop();
                } else if (secondTop == '[' && c == ']') {
                    stack.pop();
                } else {
                    return false;
                }
 
            }
        }

        return stack.isEmpty();
    }
}
