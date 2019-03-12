public class Solution{
  public String reverseWords(String s){
    char [] ca = s.toCharArray();
    for(int i = 0; i < ca.length; i++){
      if(ca[i] != ' '){
        int j = i;
        while(j + 1 < ca.length && ca[j + 1] != ' ') j++;
        reverse(ca, i, j);
        i = j;
      }
    }
    return new String(ca);
  }
  private void reverse(char [] s, int i, int j){
    while(i < j){
      char temp s[i];
      s[i] = s[j];
      s[j] = temp;
      i++;
      j--;
    }
  }
}
