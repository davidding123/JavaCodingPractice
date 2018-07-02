public void bubbleSort(int [] a, int n){
  for(int i = 0; i < n - 1; i++){
    for(int j = 0; j < n - i - 1; ++j){
      if(a[j] > a[j+1]) swap(a, j, j + 1);
    }
  }
  
  public void b_1(int [] r, int n){
    int i = n - 1;
    while(i > 0){
      int pos = 0;
      for(int j = 0; j < i; j++){
        if(r[j] > r[j+1]){
          pos = j;
          swap(r, j, j +1);
        }
        i = pos;
      }
    }
    
    public void b_2(int [] r, int n){
      int low = 0;
      int hight = n - 1;
      int tmp, j;
      while(low < high){
        for(j = low; j < high; ++j){
          if(r[j] > r[j+1]) swap(r, j, j+1);
          --high;
        }
        for(j = high; j > low; --j){
          if(r[j] < r[j-1]) swapp(r, j, j-1);
          ++low;
        }
      }
