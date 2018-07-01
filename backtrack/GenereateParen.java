class Solution{
  public List<String> generateParenthesis(int n){
    List<String> list = new ArrayList<>();
    if(n == 0) return list;
    helper(list, "", n, 0, 0);
    return list;
  }
  
  private void helper(List<String> list, String cur, int n, int open, int close){
    if(n == close){
      list.add(cur);
      return;
    }
    if(open < n){
      helper(list, cur + "(", n, open+1, close);
    }
    if(close < open){
      helper(list, cur + ")", n, open, close +1);
    }
  }
}
