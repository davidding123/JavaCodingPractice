class Solution{
  public int numSquares(int n){
    if(n == 0) return 0;
    if(n == 1) return 1;
    int [] dp = new int[n + 1];
    Arrays.fill(dp, n);
    dp[0] = 0;
    for(int i = 1; i <= n; i++){
      for(int j = 1; j*j <= i; j++){
        dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
      }
    }
    return dp[n];
  }
}
