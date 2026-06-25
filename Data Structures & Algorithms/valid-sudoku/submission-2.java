class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < board.length; i++) {
            int count = 0;
            HashMap<Character, Integer> rowDuplicate = new HashMap<>();
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                if(rowDuplicate.containsKey(board[i][j])) {
                    return false;
                }
                rowDuplicate.put(board[i][j], count+=1);
            }
        }

        for (int j = 0; j < 9; j++) {
        HashMap<Character, Integer> colDuplicate = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            if (board[i][j] == '.') continue;
            if (colDuplicate.containsKey(board[i][j])) {
                return false;
            }
            colDuplicate.put(board[i][j], 1);
        }
}

        for (int box = 0; box < 9; box++) {
            int startRow = (box / 3) * 3;
            int startCol = (box % 3) * 3;
            int count = 0;

            HashMap<Character, Integer> boxCheck = new HashMap<>();
            for (int r = startRow; r < startRow + 3; r++) {
                for (int c = startCol; c < startCol + 3; c++) {
                    // check board[r][c], add to boxCheck, return false on duplicate
                    if(board[r][c] == '.') {
                        continue;
                    }
                    if(boxCheck.containsKey(board[r][c])) {
                        return false;
                    }
                    boxCheck.put(board[r][c], count+=1);
                }
            }
        }
        return true;
    }


}
