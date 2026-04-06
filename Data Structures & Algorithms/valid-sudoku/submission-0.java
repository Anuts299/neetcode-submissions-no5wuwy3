class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] colsSet = new HashSet[9];
        Set<Character>[] rowsSet = new HashSet[9];
        Set<Character>[] boxsSet = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            colsSet[i] = new HashSet<>();
            rowsSet[i] = new HashSet<>();
            boxsSet[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if(ch == '.') continue;

                int box = (r / 3) *3 + (c / 3);
                
                if (colsSet[c].contains(ch) || rowsSet[r].contains(ch) || boxsSet[box].contains(ch)) {
                    return false;
                }
                colsSet[c].add(ch);
                rowsSet[r].add(ch);
                boxsSet[box].add(ch);
            }
        }
        return true;
    }
}
