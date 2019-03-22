class Solution{
  public List<int []> pacificAtlantic(int [][] matrix){
    List<int []> result = new ArrayList<>();
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return result;
    int m = matrix.length, n = matrix[0].length;
    boolean [][] atlantic = new boolean[m][n];
    boolean [][] pacific = new boolean[m][n];
    for(int i = 0; i < m; i++){
      helper(matrix, i, 0, pacific, Integer.MIN_VALUE);
      helper(matrix, i, n-1, atlantic, Integer.MIN_VALUE);
    }
    for(int j = 0; j < n; j++){
      helper(matrix, 0, j, pacific, Integer.MIN_VALUE);
      helper(matrix, m-1, j, atlantic, Integer.MIN_VALUE);
    }
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(atlantic[i][j] && pacific[i][j]) result.add(new int []{i, j});
      }
    }
    return result;
  }
  
  int [][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
  public void helper(int [][] matrix, int x, int y, boolean [][] isVisited, int height){
    int m = matrix.length, n = matrix[0].length;
    if(x < 0 || x >= m || y < 0 || y >= n || isVisited[x][y] || matrix[x][y] < height) return;
    isVisited[x][y] = true;
    for(int [] dir: dirs){
      helper(matrix, x + dir[0], y + dir[1], isVisited, matrix[x][y]);
    }
  }
}
