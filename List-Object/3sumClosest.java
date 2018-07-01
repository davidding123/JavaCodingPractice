class Solution{
public int threeSumClosest(int [] nums, int target){
Arrays.sort(nums);
int result = nums[0] + nums[1] + nums[nums.length - 1];
for(int i = 0; i < nums.length; i++){
int start = i + 1, end = nums.length - 1;
while(start < end){
int sum = nums[i] + nums[start] + nums[end];
if(sum == target) return target;
else if(sum < target){
start++;
}else{
end--;
}
if(Math.abs(result - target) > Math.abs(sum - target)) result = sum;
}
return result;
}
}
