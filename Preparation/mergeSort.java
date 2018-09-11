private void mergeSort(int [] a, int [] tmpArray, int left, int right){
  if(left < right){
    int center = left + (right - left) /2;
    mergeSort(a, tmpArray, left, center);
    mergeSort(a, tmpArray, center + 1, right);
    merge(a, tmpArray, left, center + 1, right);
  }
}

public void mergeSort(int [] a){
  int [] temp = new int[a.length];
  mergeSort(a, temp, 0, a.length - 1);
}

private void merge(int a, int [] temp, int leftPos, int rightPos, int rightEnd){
  int leftEnd = rightPos - 1;
  int tempPos = leftPos;
  int n = rightEnd - leftPos + 1;
  while(leftPos <= leftEnd && rightPos <= rightEnd){
    if(a[leftPos] <= a[rightPos]) temp[tempPos++] = a[leftPos++];
    else temp[tempPos++] = a[rightPos++];
  }
  while(leftPos <= leftEnd) temp[tempPos++] = a[leftPos++];
  while(rightPos <= rightEnd) temp[tempPos++] = a[rightPos++];
  for(int i = 0; i < n; i++, rightEnd--) a[rightEnd] = temp[rightEnd];
}

线性附加内存
时间复杂度：O(NlogN)
