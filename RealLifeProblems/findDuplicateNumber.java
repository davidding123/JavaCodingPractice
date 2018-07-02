//Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), 
//prove that at least one duplicate number must exist. 
//Assume that there is only one duplicate number, find the duplicate one.
class Solution{
  public int findDuplicate(int [] nums){
    int n = nums.length;
    int slow = n, fast = n;
    do{
      slow = nums[slow - 1];
      fast = nums[nums[fast - 1] - 1];
    }while(slow!=fast);
    slow = n;
    while(slow != fast){
      slow = nums[slow - 1];
      fast = nums[fast - 1];
    }
    return slow;
  }
}
