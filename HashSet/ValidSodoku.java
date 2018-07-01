class Solution{
  public boolean isValidSodoku(char [][] board){
    for(int i = 0; i < 9; i++){
      HashSet<Character> rows = new HashSet<>();
      HashSet<Character> cols = new HashSet<>();
      HashSet<Character> cube = new HashSet<>();
      for(int j = 0; j < 9; j++){
        char c = board[i][j], d = board[j][i];
        if(c!='.' && rows.add(c)) return false;
        if(d!='.' && cols.add(d)) return false;
        int rowIndex = 3*(i/3), colIndex = 3*(i%3);
        if(board[rowIndex + j/3][colIndex + j%3] != '.' && !cube.add(board[rowIndex + j/3][colIndex + j%3])) return false;
      }
    }
    return true;
  }
}
