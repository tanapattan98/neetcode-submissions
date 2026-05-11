class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        
        for (int i = 0; i < heights.length; i++) {
            for (int j = heights.length - 1; i < j; j--) {
                if (i == j) continue;
                int area = calculateArea(i, j, heights);
                if (area > result) result = area; 
            }
        }
        return result;
    }


    private int calculateArea(int i, int j, int[] heights) {
        int height = Math.min(heights[i], heights[j]);
        return (j - i) * height;
        
    }
}
