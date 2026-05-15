class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] index = new int[n];
        Deque<Map.Entry<Integer, Integer>> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek().getValue() < temperatures[i]) {
                Map.Entry<Integer, Integer> popped = stack.pop();
                index[popped.getKey()] = i - popped.getKey();
            }
            stack.push(Map.entry(i, temperatures[i]));
        }
        return index;
    }
}
