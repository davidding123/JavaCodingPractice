private void selectSort(int [] a){
  for(int i = 0; i < a.length; i++){
    int k = i;
    for(int j = i+1; j < a.length; j++){
      if(a[k] > a[j]) k = j;
    }
    swap(a, k, j);
  }
}

private void swap(int [] a, int k, int j){
  if(i == j) return;
  int temp = a[k];
  a[k] = a[j];
  a[j] = temp;
}
