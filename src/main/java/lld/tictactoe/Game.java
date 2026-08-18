package lld.tictactoe;

import java.util.List;

public class Game {
    private final Board board;
    private final List<Player> players;
    private final WinningStrategy winningStrategy;
    private int currentPlayerIndex;
    private GameState gameState;
    private int moves;
    public Game(Board board, List<Player> players, WinningStrategy winningStrategy) {
        this.board = board;
        this.players = players;
        this.winningStrategy = winningStrategy;
        this.currentPlayerIndex = 0;
        this.moves = 0;
        this.gameState = GameState.NOT_STARTED;
    }

    public void startGame() {
        if(players.size() != 2) {
            throw new IllegalArgumentException("Game requires exactly 2 players");
        }
        if(gameState != GameState.NOT_STARTED) {
            throw new IllegalStateException("Game has already started");
        }
        this.gameState = GameState.IN_PROGRESS;
    }


    public void makeMove(int row, int col){
        if(gameState != GameState.IN_PROGRESS) {
            throw new IllegalStateException("Game is not in progress");
        }
        Player player = players.get(currentPlayerIndex);
        board.makeMove(row, col, player.getSymbol());
        moves++;
        if(winningStrategy.checkWinner(board, row, col, player.getSymbol())) {
            gameState = GameState.valueOf("PLAYER" + (currentPlayerIndex + 1) + "_WON");
            System.out.println(
                player.getName() + " wins!"
            );  
            return;      
        }
        if(moves == board.getSize() * board.getSize()) {
            gameState = GameState.DRAW;
            System.out.println("Game is a draw!");
            return;
        }
        switchPlayer();
    }

    private void switchPlayer(){
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }

}
