class Solution {
    private static List<Character> opening = List.of('(', '{', '[');
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (opening.contains(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != map.get(c )) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
