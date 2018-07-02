public void insertSort(int [] a){
  for(int i = 1; i < a.length; i++){
    int j;
    int x = a[i];
    for(j = i; j > 0 && x < a[j-1]; j--){
      a[j] = a[j-1];
    }
    a[j] = x;
  }
