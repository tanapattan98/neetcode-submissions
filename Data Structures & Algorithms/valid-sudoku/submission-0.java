class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] squares = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];

                if (c == '.') {
                    continue;
                } 

                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i].contains(c) || 
                    columns[j].contains(c) || 
                    squares[boxIndex].contains(c)) {
                        return false;
                    }

                rows[i].add(c);
                columns[j].add(c);
                squares[boxIndex].add(c);
            }
        }

        return true;
    }
}
