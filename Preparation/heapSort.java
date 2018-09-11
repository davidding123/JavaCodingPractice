private static int leftChild(int i){
  return 2*i + 1;
}
private static void percDown(int [] a, int i, int n){
  int child, temp;
  for(temp = a[i]; leftChild(i) < n; i = child){
    child = leftChild(i);
    if(child != n - 1 && a[child] < a[child+1]) child++;
    if(temp < a[child]) a[i] = a[child];
    else break;
  }
  a[i] = temp;
}

public void heapSort(int [] a){
  for(int i = a.length/2 - 1; i>=0; i--){
    precDown(a, i, a.length);
  }
  for(int i = a.length -1; i > 0; i--){
    swapReferences(a, 0, i);
    percDown(a, 0, i);
  }
}

TimeComplexity: O(Nlog(N))
使用了附加数组 存储需求增加一倍

