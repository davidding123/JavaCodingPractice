class Solution{
  public int search(int [] nums. int target){
    int i = 0, j = nums.length - 1;
    while(i <= j){
      int m = i + (j - i)/2;
      if(nums[m] == target) return m;
      if(nums[i] > nums[m]){
        if(nums[m] < target && target <= nums[j]){
          i=m+1;
        }else{
          j=m-1;
        }
      }else{
        if(target < nums[m] && target >= nums[i]){
          j = m - 1;
        }else{
          i = m + 1;
        }
      }
    }
    return -1;
  }
