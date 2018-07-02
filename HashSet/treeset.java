//Given an array of integers, find out whether there are two distinct indices i and j in the array 
//such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference 
//between i and j is at most k.

public boolean containsNearbyAlmostDuplicate(int [] nums, int k, int t){
  if(k < 1 || t < 0 ) return false;
  if(nums == null || nums.length <= 1) return false;
  final TreeSet<Long> values = new TreeSet<>();
  for(int i = 0; i < nums.length; i++){
    final Long floor = values.floor(nums[i] + (long)t);
    final Long ceiling = values.ceiling(nums[i] - (long)t);
    if((floor!=null && floor >= nums[i]) || (ceiling != null && ceiling <= nums[i])) return true;
    values.add((long)nums[i]);
    if(i >= k) values.remove((long)nums[i-k]);
  }
  return false;
}
}
