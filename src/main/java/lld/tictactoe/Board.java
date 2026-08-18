package lld.tictactoe;

public class Board {
    private final Symbol[][] grid;
    private final int size;

    public Board(int size) {
        this.size = size;
        this.grid = new Symbol[size][size];
    }

    public boolean isValidMove(int row, int col) {
        return row >=0  && row < size && col >= 0 && col < size && grid[row][col] == null;
    }

    public void makeMove(int row, int col, Symbol symbol){
        if(!isValidMove(row, col)) {
            throw new IllegalArgumentException("Invalid move");
        }
        grid[row][col] = symbol;
    }

    public Symbol getCell(int row, int col) {

        if (row < 0 || row >= size ||
            col < 0 || col >= size) {

            throw new IllegalArgumentException("Invalid cell");
        }

        return grid[row][col];
    }

    public int getSize() {
        return size;
    }
}
