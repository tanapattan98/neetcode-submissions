class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;

        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                total = total * nums[i];
            }
        }

        int[] results = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            if (zeroCount == 0) {
                results[i] = total / nums[i];
            } else if (zeroCount == 1) {
                results[i] = (nums[i] == 0) ? total : 0;
            } else {
                results[i] = 0;
            }
            
        }

        return results;
    }
}  
