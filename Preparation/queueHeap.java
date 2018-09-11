public void insert(AnyType x){
  if(currentSize == array.length - 1)
    enlargeArray(array.length * 2 + 1);
  int hole = ++currrentSize;
  for(array[0] = x; x.compareTo(array[hole/2]) < 0; hole /=2)
    array[hole] = array[hole/2];
  array[hole] = x;
}

public AnyType deleteMin(){
  if(isEmpty()) throw new UnderflowException();
  AnyType minItem = findMin();
  array[1] = array[currentSize--];
  percolateDown(1);
  return minItem;
}

private void percolateDown(int hole){
  int child;
  AnyType tmp = array[hole];
  for(;hole * 2 <= currentSize; hole = child){
    child = hold * 2;
    if(child != currentSize && array[child + 1].compareTo(array[child]) < 0) child ++;
    if(array[child].compareTo(tmp) < 0) array[hole] = array[child];
    else break;
  }
  array[hole] = tmp;
}


public BinaryHeap(AnyType [] items){
  currentSize = items.length;
  array = (AnyType[]) new Comparable[(currentSize + 2) * 11/10];
  int i = 1;
  for(AnyType item: items) array[i++] = item;
  buildHeap();
}

private void buildHeap(){
  for(int i = currentSize /2; i > 0; i--){
    precolateDown(i);
  }
    
