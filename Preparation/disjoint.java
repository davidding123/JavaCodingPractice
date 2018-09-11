public class DisjSets{
  private int [] s;
  public DisjSets(int n){
   s = new int[n];
   for(int i = 0; i < n; i++) s[i] = -1;
  }
  
  public void union(int root1, int root2){
    s[root2] = root1;
  }
  
  public int find(int x){
    if(s[x] < 0) return x;
    else return find(s[x]);
  }
  
}

按高度（秩rank）求并
public void union(int root1, int root2){
  if(s[root2] < s[root1]) s[root1] = s[root2];
  else{
  if(s[root1] == s[root2]) s[root1]--;
  s[root2] = root1;
  }
  }
  
路径压缩
public int find(int x){
if(s[x] < 0) return x;
return s[x] = find(s[x]);
}

任意的最多M次find和直到N-1次union的运行时间只比O（M+N）多一点。
