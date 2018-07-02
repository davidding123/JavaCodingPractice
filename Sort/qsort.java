private void quickSort(int [] a, int low, int high){
  if(low < high) {
    int middle = getMiddler(a, low, high);
    quickSort(a, 0, middle - 1);
    quickSort(a, middle + 1, high);
  }
}

public int getMiddle(int [] a, int low, int high){
  int key = a[low];
  while(low < high){
    while(low < high && a[high] >= key){
      high--;
      a[low] = a[high];
      while(low < high && a[low] <= key){
        low++;
        a[high] = a[low];
      }
      a[low] = key;
      return low;
    }
  }
