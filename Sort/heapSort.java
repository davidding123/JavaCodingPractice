public static void main(String [] args){
  int [] a = {1, 3};
  for(int i = 0; i < a.length; i++){
    heapSort(a, a.length -1-i);
    swap(a, 0, a.length - 1- i);
  }
}

private void heapSort(int [] data, int last){
  for(int i = (last - 1) /2; i>= 0; i--){
    int parent = i;
    while(2 * parent + 1 <= last){
      int bigger = 2 * parent + 1;
      if(bigger < last){
        if(data[bigger] > data[bigger + 1]){
          bigger = bigger + 1;
        }
      }
      if(data[parent] > data[bigger]){
        swap(data, parent, bigger);
        parent = bigger;
      }else break;
    }
  }
