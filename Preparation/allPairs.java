public static void allPairs(int [][] a, int [][] d, int [][] path){
  int n = a.length;
  for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
      d[i][j] = a[i][j];
      path[i][j] = -1;
    }
  }
  for(int k = 0; k < n; k++){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(d[i][k] + d[k][j] < d[i][j]){
          d[i][j] = d[i][k] + d[k][j];
          path[i][j] = k;
        }
      }
    }
  }
