public void bubbleSort(int [] a, int n){
  for(int i = 0; i < n - 1; i++){
    for(int j = 0; j < n - i - 1; ++j){
      if(a[j] > a[j+1]) swap(a, j, j + 1);
    }
  }
