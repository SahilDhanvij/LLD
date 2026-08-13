package lld.tictactoe;

public class Board {
    private final char[][] grid;
    private final int size;

    public Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
        // TODO: initialize cells to empty marker, e.g. '-'
    }

    public boolean placeMark(int row, int col, char symbol) {
        // TODO: validate bounds + cell empty, place mark, return success
        throw new UnsupportedOperationException("not implemented");
    }

    public boolean checkWin(char symbol) {
        // TODO: check rows, columns, both diagonals
        throw new UnsupportedOperationException("not implemented");
    }

    public boolean isFull() {
        // TODO
        throw new UnsupportedOperationException("not implemented");
    }
}
