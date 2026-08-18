package lld.tictactoe;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(0,"Alice",Symbol.X);
        Player player2 = new Player(1,"Bob",Symbol.O);
        WinningStrategy winningStrategy = new normalStrategy();
        Board board = new Board(3);
        Game game = new Game(board, Arrays.asList(player1, player2), winningStrategy);
        game.startGame();
        game.makeMove(0, 0); // Alice
        game.makeMove(0, 1); // Bob
        game.makeMove(1, 1); // Alice
        game.makeMove(0, 2); // Bob
        game.makeMove(2, 2); // Alice wins  
    }
}
