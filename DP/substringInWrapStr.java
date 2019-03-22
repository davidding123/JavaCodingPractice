class Solution{
  public int findSubstringInWraproundString(String p){
    if(p == null || p.length() == 0) return 0;
    if(p.length() == 1) return 1;
    int [] dp = new int[26];
    int curLen = 0;
    for(int i = 0; i < p.length(); i++){
      if(i > 0 && (p.charAt(i) == p.charAt(i - 1) + 1 || p.charAt(i) == p.charAt(i - 1) -25)){
        curLen++;
      }else{
        curLen = 1;
      }
      dp[p.charAt(i) - 'a'] = Math.max(dp[p.charAt(i) - 'a'], curLen);
    }
    int sum = 0;
    for(int num : dp) sum += num;
    return sum;
  }
}
