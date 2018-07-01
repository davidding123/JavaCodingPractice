class Solution{
  public int removeDuplicats(int [] nums){
    if(nums.length < 2) return nums.length;
    int start = 1;
    for(int i = 1; i < nums.length; i++){
      if(nums[i] != nums[i-1]) nums[start++] = nums[i];
    }
    return start;
  }
}
 
