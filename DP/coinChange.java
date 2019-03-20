class Solution{
  public int coinChange(int [] coins, int amount){
    if(coins == null || coins.length == 0 || amount < 0) return -1;
    if(amount == 0) return 0;
    Arrays.sort(coins);
    int [] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0;
    for(int i = 1; i <= amount; i++){
      for(int j = 0; j < coins.length; j++){
        if(coins[j] <= i) dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
      }
    }
    return dp[amount] == amount + 1?-1:dp[amount];
  }
}
