class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j <board[i].length; j++){
                if(board[i][j] == 'X'){
                    count++;
                    foo(board, i, j);
                }
                
            }
        }
        return count;
    }
    
    private void foo(char[][] board, int i, int j){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return;
        }
        if(board[i][j] != 'X'){
            return;
        }
        board[i][j] = 'V';
        foo(board, i+1, j);
        foo(board, i, j+1);
    }
}