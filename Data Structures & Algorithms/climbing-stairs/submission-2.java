class Solution {
    // public int climbStairs(int n) {
    //     if (n <= 2) return n;

    //     int[] dp = new int[n + 1];
    //     dp[1] = 1;
    //     dp[2] = 2;

    //     for (int i = 3; i <= n; i++) {
    //         dp[i] = dp[i - 1] + dp[i - 2];
    //     }

    //     return dp[n];
    // }

    Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        

        if (n <= 2) return n;
        if (memo.containsKey(n)) return memo.get(n);

        int result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);

        return result;
    }
}
