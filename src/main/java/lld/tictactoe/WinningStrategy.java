package lld.tictactoe;

public interface WinningStrategy {
    boolean checkWinner(Board board, int row, int col, Symbol symbol);
}
