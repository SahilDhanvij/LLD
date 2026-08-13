package lld.tictactoe;

public class Game {
    private final Board board;
    private final Player player1;
    private final Player player2;

    public Game(int boardSize, Player player1, Player player2) {
        this.board = new Board(boardSize);
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        // TODO: alternate turns, prompt/simulate moves, check win/draw after
        // each move, print result.
        throw new UnsupportedOperationException("not implemented");
    }
}
