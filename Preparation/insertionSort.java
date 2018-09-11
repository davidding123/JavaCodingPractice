public void insertionSort(int [] a){
  int j;
  for(int i = 1; i < a.length; i++){
    int temp = a[i];
    for(j = i; j > 0 && a[j] > a[j-1]; j--){
      a[j] = a[j-1];
    }
    a[j] = temp;
  }
}
  
Time Complexitity: O(N^2)
