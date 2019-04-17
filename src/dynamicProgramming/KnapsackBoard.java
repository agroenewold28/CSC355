package dynamicProgramming;

// Created by 
public class KnapsackBoard {
    KnapsackBoardCells board[][];
    int nRows;     // rows correspond to items, so number of items.
    int nCols;     // columns corresponds to weights. Column c has weight c+1.

    // The board as has columns corresponding to weights: 1, 2, 3, 4, etc.
    // The board has rows corresponding to items being considered.
    // The board cells are KnapsackBoardCells.

    /**
     * Given an array items, creates all the cells in the board.
     * Assume that the weight columns go up to the maximum weight item.
     *
     * @param items
     */
    public KnapsackBoard(KnapsackItem items[]) {
        nRows = items.length;

        // Find the maximum weight in the given items
        int maxWeight = 0;
        for (int i=0; i<nRows; i++) {
            if (items[i].weight > maxWeight)
                maxWeight = items[i].weight;
        }
        nCols = maxWeight;

        // Since we know the nRows, nCols, create the board.
        board = new KnapsackBoardCells[nRows][nCols];

        for (int r = 0; r < nRows; r++)  // items
            for (int c = 0; c < nCols; c++) {  // weights
                board[r][c] = new KnapsackBoardCells();  // create cell
                board[r][c].weightOfCell = c + 1;  // c + 1 because c[0] has weight 1, c[1] has wt 2, etc.
                board[r][c].items = "";
            }
    }

    // Keep in mind that r corresponds to item row.  c corresponds to weight column
    public KnapsackBoardCells get(int r, int c) {
        return board[r][c];
    }

    // Keep in mind that r corresponds to item row.  c corresponds to weight column
    public void set(int r, int c, int value, String items) {
        board[r][c].items = items;
        board[r][c].bestValue = value;
    }


    public void printFullBoard() {
        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nCols; c++) {
                System.out.print("   " + board[r][c].bestValue + "/" + board[r][c].items);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
