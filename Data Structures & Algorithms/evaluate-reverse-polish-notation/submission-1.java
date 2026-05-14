class Solution {
    private final static List<String> OPERANDS = List.of("+", "-", "*", "/");

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            System.out.println("Beginning: " + stack.toString() + " token: " + token);
            if (OPERANDS.contains(token)) {
                int first = stack.pop();
                int second = stack.pop();

                if (token.equals("+")) {
                    stack.push(second + first);
                }

                if (token.equals("-")) {
                    stack.push(second - first);
                }

                if (token.equals("*")) {
                    stack.push(second * first);
                }

                if (token.equals("/")) {
                    stack.push(second / first);
                }

            } else {
                stack.push(Integer.valueOf(token));
            }

            System.out.println("End: " + stack.toString());
        }
        return stack.pop();
    }
}
