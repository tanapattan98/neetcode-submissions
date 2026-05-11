class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int area = calculateArea(left, right, heights);
            result = Math.max(result, area);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }


    private int calculateArea(int left, int right, int[] heights) {
        int height = Math.min(heights[left], heights[right]);
        return (right - left) * height;
        
    }
}
