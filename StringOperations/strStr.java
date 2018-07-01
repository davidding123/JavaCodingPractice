class Solution{
  public int strStr(String haystack, String needle){
    if(haystack.length() == 0 && needle.length() == 0) return 0;
    return haystack.indexOf(needle) >= 0? haystack.indexOf(needle):-1;
  }
}
