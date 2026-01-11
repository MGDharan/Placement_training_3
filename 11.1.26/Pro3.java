class NQueens {
    public void solveNQueens(int n) {
        int[] board = new int[n];
        placeQueen(board, 0, n);
    }

    private void placeQueen(int[] board, int row, int n) {
        if (row == n) {
            printBoard(board, n);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                placeQueen(board, row + 1, n);
            }
        }
    }

    private boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == row - i)
                return false;
        }
        return true;
    }

    private void printBoard(int[] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i] == j ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
