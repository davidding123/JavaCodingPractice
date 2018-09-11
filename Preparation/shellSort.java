public void shellSort(int [] a){
  int j;
  for(int gap = a.length/2; gap > 0; gap /= 2){
    for(int i = gap; i < a.length; i++){
      int temp = a[i];
      for(int j = i; j >= gap && temp < a[j-gap]; j -= gap){
        a[j] = a[j-gap];
      }
      a[j] = temp;
    }
  }
  
  
  
  time complexity: O(N^2) Hibbard: O(M^3/2)
    
