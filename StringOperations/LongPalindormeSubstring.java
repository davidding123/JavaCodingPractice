/*Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
*/

class Solution {
    public int lo = 0;
    public int max = 0;
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 1) return s;
        int n = s.length();
        for(int i = 1; i < n; i++){
            helper(s, i, i);
            helper(s, i-1, i);
        }
        return s.substring(lo, lo + max);
    }
    
    public void helper(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        if(max < r-l-1){
            max = r-l-1;
            lo = l+1; 
        }
    }
}
