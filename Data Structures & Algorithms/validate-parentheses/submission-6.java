class Solution {
    

    private static final Map<Character, Character> PAIRS = Map.of(')', '(', '}', '{', ']', '[');
    public boolean isValid(String s) {
        
    
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (!PAIRS.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != PAIRS.get(c )) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
