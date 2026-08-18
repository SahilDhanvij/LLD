package lld.tictactoe;

public class normalStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, int row, int col, Symbol symbol){
        int size = board.getSize();

        boolean rowWin = true;
        for(int i = 0; i < size; i++) {
            if(board.getCell(row, i)!=symbol) {
                break;
            }
        }
        if(rowWin) {
            return true;
        }
        boolean colWin = true;
        for(int i = 0; i < size; i++) {
                if(board.getCell(i, col)!=symbol) {
                    break;
                }
        }
        if(colWin) {
            return true;
        }
        if(row==col){
            boolean diagWin = true;
            for(int i = 0; i < size; i++) {
                if(board.getCell(i, i)!=symbol) {
                    break;
                }
            }
            if(diagWin) {
                return true;
            }
            boolean antiDiagWin = true;
            for(int i = 0; i < size; i++) {
                if(board.getCell(i, size-1-i)!=symbol) {
                    break;
                }
            }
            if(antiDiagWin) {
                return true;
            }  
        }
        return false;
    }
}
