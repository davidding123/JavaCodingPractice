class Solution{
public int maxArea( int [] height){
if(height == null || height.length <= 1) return 0;
int ans = 0, l = 0, r = height.length - 1;
while(l < r){
int left = height[l], right = height[r];
int h = Math.min(left, right);
ans = Math.max(ans, h*(r-l));
if(left < right) l++;
else r--;
}
return ans;
}
