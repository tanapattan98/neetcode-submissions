class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) {
            return image;
        }
        fill(image, sr, sc, originalColor, color);

        return image;
    }

    private void fill(int[][] image, int sr, int sc, int originalColor, int color) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }

        if (image[sr][sc] != originalColor) {
            return;
        }

        image[sr][sc]  = color;

        fill(image, sr + 1, sc, originalColor, color);
        fill(image, sr, sc + 1, originalColor, color);
        fill(image, sr - 1, sc, originalColor, color);
        fill(image, sr, sc - 1, originalColor, color);
    }
}