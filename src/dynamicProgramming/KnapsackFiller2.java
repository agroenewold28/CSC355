package dynamicProgramming;


public class KnapsackFiller2 {

    public static void main(String[] args) {
        KnapsackItem items[] = {
                new KnapsackItem("guitar", 1, 1500),
                new KnapsackItem("stereo", 4, 3000),
                new KnapsackItem("laptop", 3, 2000)
        };

        KnapsackFiller2.fill(items);
    }

    private static void fill(KnapsackItem items[]) {
        KnapsackBoard board = new KnapsackBoard(items);

        board.printFullBoard();

        // Fill in the first row (row 0).
        // We're going to put items[0] into every cell in this row.
        for (int c = 0; c<board.nCols; c++) {
            board.set(0, c, items[0].value, items[0].name);
        }

        // Fill in the remaining rows
        for (int r=1; r<board.nRows; r++) {  // r corresponds to items
            for (int c = 0; c<board.nCols; c++) {  // c correspond to weights

                // Get the values from the row above.

                // Shove this into the current cell we're working on.

                // Now consider items[r]. Does it fit in the weight of this column?
                // If it does, does it have a higher value?
                // And is there any remaining weight that we can use to pick up more?
                // Is that higher than the previous best value?

            }
        }

        board.printFullBoard();

    }
}
