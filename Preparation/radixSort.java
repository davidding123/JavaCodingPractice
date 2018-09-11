public void radixSort(String [] arr, int stringLen){
  final int BUCKETS = 256;
  ArrayList<String> [] buckets = new ArrayList<String>[BUCKETS];
  for(int i = 0; i < BUCKETS; i++) buckets[i] = new ArrayList<>();
  for(int pos = stringLen - 1; pos >= 0; pos--){
    for(String str : arr){
      buckets[s.charAt(pos)].add(str);
    }
    int idx = 0;
    for(ArrayList<String> thisBucket: buckets){
      for(String s : thisBucket) {
        arr[idx++] = s;
        thisBucket.clear();
      }
    }
  }
  
  所有字符串有长度l， 可以O（NL）
