class Solution{
  public int arrayNesting(int [] nums){
    int max = Integer.MIN_VALUE;
    boolean [] isVisited = new boolean[nums.length];
    for(int i = 0; i < nums.length; i++){
      if(isVisited[i]) continue;
      max = Math.max(max, helper(nums, i, isVisited));
    }
    return max;
  }
  
  public int helper(int [] nums, int start, boolean [] isVisited){
    int i = start, count = 0;
    while(count == 0 || i != start){
      isVisited[i] = true;
      i = nums[i];
      count++;
    }
    return count;
  }
}
                    
