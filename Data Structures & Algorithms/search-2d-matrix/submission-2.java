class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int middlePosition = low + (high - low) / 2;
            int value = matrix[middlePosition / n][middlePosition % n];

            if (target == value) {
                return true;
            } else if (target > value) {
                low = middlePosition + 1;
            } else {
                high = middlePosition - 1;
            }
        }

        return false;
    }

}
