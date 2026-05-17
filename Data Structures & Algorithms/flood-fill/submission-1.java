class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        if (originalColor == color) return image;

        int rows = image.length;
        int cols = image[0].length;

        // Deque<int[]> stack = new ArrayDeque<>();
        // stack.push(new int[]{sr, sc});

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr, sc});

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!queue.isEmpty()){
        // while (!stack.isEmpty()){
            int[] pixel = queue.poll();
            // int[] pixel = stack.pop();
            int r = pixel[0];
            int c = pixel[1];

            if (r < 0 || r >= rows || c < 0 || c >= cols) continue;

            if (image[r][c] != originalColor) continue;

            image[r][c] = color;

            for (int[] d : directions) {
                queue.offer(new int[]{r + d[0], c + d[1]});
                // stack.push(new int[]{r + d[0], c + d[1]});
            }
        }

        return image;
    }


    // public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    //     int originalColor = image[sr][sc];
    //     if (originalColor == color) {
    //         return image;
    //     }
    //     fill(image, sr, sc, originalColor, color);

    //     return image;
    // }

    // private void fill(int[][] image, int sr, int sc, int originalColor, int color) {
    //     if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
    //         return;
    //     }

    //     if (image[sr][sc] != originalColor) {
    //         return;
    //     }

    //     image[sr][sc]  = color;

    //     fill(image, sr + 1, sc, originalColor, color);
    //     fill(image, sr, sc + 1, originalColor, color);
    //     fill(image, sr - 1, sc, originalColor, color);
    //     fill(image, sr, sc - 1, originalColor, color);
    // }
}