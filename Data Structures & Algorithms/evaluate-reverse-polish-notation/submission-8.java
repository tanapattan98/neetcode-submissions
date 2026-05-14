class Solution {
    private final static Set<String> OPERATORS = Set.of("+", "-", "*", "/");

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (OPERATORS.contains(token)) {
                int first = stack.pop();
                int second = stack.pop();

                if (token.equals("+")) {
                    stack.push(second + first);
                } else if (token.equals("-")) {
                    stack.push(second - first);
                } else if (token.equals("*")) {
                    stack.push(second * first);
                } else if (token.equals("/")) {
                    stack.push(second / first);
                }

            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
