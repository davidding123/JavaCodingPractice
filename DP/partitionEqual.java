class Solution{
  public boolean canPartition(int [] nums){
    if(nums == null || nums.length == 0) return false;
    Arrays.sort(nums);
    int sum = 0;
    for(int num : nums) sum += num;
    if((sum&1) != 0) return false;
    sum = sum >> 1;
    boolean [] dp = new boolean[sum + 1];
    dp[0] = true;
    for(int num : nums){
      for(int i = sum; i >= 1; i--){
        if(num <= i) dp[i] = dp[i] || dp[i - num];
      }
    }
    return dp[sum];
  }
}
