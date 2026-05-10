class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> indexWithNonZero = new ArrayList<>(nums.length);
        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                indexWithNonZero.add(i);
                total = total * nums[i];
            }
        }

        int[] results = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            if (indexWithNonZero.size() == nums.length) {
                results[i] = total / nums[i];
            } else if (indexWithNonZero.size() == nums.length - 1) {
                results[i] = (nums[i] == 0) ? total : 0;
            } else {
                results[i] = 0;
            }
            
        }

        return results;
    }

    // public int[] productExceptSelf(int[] nums) {
    //     ArrayList<Integer> indexWithZero = new ArrayList<>(nums.length);
    //     int total = 1;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == 0) {
    //             indexWithZero.add(i);
    //         } else {
    //             total = total * nums[i];
    //         }
    //     }
    //     System.out.println(indexWithZero.toString());
    //     System.out.println("total: " + total);

    //     int[] results = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         System.out.println("i: " + i);
    //         System.out.println("nums[i]: " + nums[i]);

    //         if (indexWithZero.contains(i)) {       
    //             results[i] = total;
    //         } else if(!indexWithZero.contains(i) && indexWithZero.isEmpty()) {
    //             results[i] = total / nums[i];
    //         } else {
    //             results[i] = 0;
    //         }
            
    //     }

    //     return results;
    // }



    // public int[] productExceptSelf(int[] nums) {
    //     int[] results = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         int product = 1;
    //         for (int j = 0; j < nums.length; j++) {
    //             if (i != j) {
    //                 product = product * nums[j];
    //             }

    //         }
    //         results[i] = product;
    //     }

    //     return results;
    // }
}  
