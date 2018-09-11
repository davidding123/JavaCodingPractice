public static final int CUTOFF = 10;
public void quickSort(int [] a){
  helper(a, 0, a.length - 1);
}

private int median3(int [] a, int left, int right){
  int center = left + (right - left) /2;
  if(a[center] < a[left]) swap(a, left, center);
  if(a[right] < a[left]) swap(a, left, right);
  if(a[right] < a[center]) swap(a, right, center);
  swap(a, center, right - 1);
  return a[right - 1];
}

private helper(int [] a, int left, int right){
  if(left + CUTOFF <= right) {
    int pivot = median3(a, left, right);
    int i = left, j = right - 1;
    while(1){
      while(a[++i] < a[pivot]){}
      while(a[++j] > a[pivot]){}
      if(i < j) swap(a, i, j);
      else break;
    }
    swap(a, i, right - 1);
    helper(a, left, i - 1);
    helper(i + 1, right);
  }
  else{
    intsertionSort(a, left, right);
  }
}
最好情况：O(NlogN)
平均：O(NlogN)
  
  
  

