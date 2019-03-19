class Solution{
  public int rob(int [] nums){
    if(nums == null ||| nums.length == 0) return 0;
    if(nums.length == 1) return nums[0];
    return Math.max(helper(nums, 0, nums.length - 2), helper(nums, 1, nums.length - 1));
  }
 
  private int helper(int [] nums, int start, int end){
    int preRob = 0, preNotRob = 0, rob = 0, notRob = 0;
    for(int i = start; i <= end; i++){
      rob = preNotRob + nums[i];
      notRob = Math.max(preRob, preNotRob);
      preRob = rob;
      preNotRob = notRob;
    }
    return Math.max(rob, notRob);
  }
}
