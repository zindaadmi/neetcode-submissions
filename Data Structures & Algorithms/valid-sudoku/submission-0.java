class Solution {
    public boolean isValidSudoku(char[][] board) {
         // Use HashSet to keep track of seen numbers in rows, cols, and boxes
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {         // rows
            for (int j = 0; j < 9; j++) {     // cols
                char num = board[i][j];

                if (num != '.') {
                    String rowKey = "row" + i + "-" + num;
                    String colKey = "col" + j + "-" + num;
                    String boxKey = "box" + (i / 3) + (j / 3) + "-" + num;

                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                        return false; // duplicate found
                    }
                }
            }
        }

        return true; // no duplicates, valid board
    }
}
