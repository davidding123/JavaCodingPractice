public void radix(String [] arr, int maxLen){
  final int BUCKETS = 256;
  ArrayList<String> [] wordsByLength = new ArrayList<String>[maxLen + 1];
  ArrayList<String> [] buckets = new ArrayList<String>[BUCKETS];
  for(int i = 0; i < wordsByLength.length; i++) wordsByLength[i] = new ArrayList<>();
  for(int i = 0; i < BUCKETS; i++) buckets[i] = new ArrayList<>();
  for(String s : arr) wordsByLength[s.length()].add(s);
  int idx = 0;
  for(ArrayList<String> wordList: wordsByLength)
    for(String s: wordList) arr[idx++] = s;
  int startingIndex = arr.length;
  for(int pos = maxLen - 1; pos >= 0; pos--){
    startingIndex -= wordsByLength[pos+1].size();
    for(int i = startingIndex; i < arr.length; i++){
      buckets[arr[i].charAt(pos)].add(arr[i]);
    }
    idx = startingIndex;
    for(ArrayList<String> thisBucket: buckests){
      for(String s: thisBucket){
        arr[idx++] = s;
      }
      thisBucket.clear();
    }
  }
}
