private void shellSort(int [] a){
  int dk = a.length/2;
  while(dk >= 1){
    shellInsertSort(a, dk);
    dk = dk/2;
  }
}

private void shellInsertSort(int [] a, int dk){
  for(int i = dk; i < a.length; i++){
    if(a[i] < a[i-dk]){
      int j;
      int x = a[j];
      for(j = i; j >= 0 && a[j] > x; j = j-dk){
        a[j+dk] = a[j];
      }
      a[j+dk] = x;
    }
  }
}
