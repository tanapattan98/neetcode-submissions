class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int high = matrix.length - 1;
        int targetArray = -1;
        
        int innerArraySize = matrix[0].length;

        while (low <= high) {
            int middlePosition = low + (high - low) / 2;
            int[] arrayAtMiddlePosition = matrix[middlePosition];

            if (target >= matrix[middlePosition][0] && target <= matrix[middlePosition][innerArraySize - 1]) {
                targetArray = middlePosition;
                break;
            } else if (target >= matrix[middlePosition][0]) {
                low = middlePosition + 1;
            } else {
                high = middlePosition - 1;
            }
        }

        if (targetArray == -1) return false;

        low = 0;
        high = innerArraySize - 1;

        while (low <= high) {
            int middlePostionInArray = low + (high - low) / 2;
            int value = matrix[targetArray][middlePostionInArray];

            if (target == value) {
                return true;
            } else if (target > value) {
                low = middlePostionInArray + 1;
            } else {
                high = middlePostionInArray - 1;
            }
        }
        return false;
    }

}
