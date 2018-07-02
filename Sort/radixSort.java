public void radixSort(int [] array){
  int max = array[0];
  for(int i = 1; i < array.length; i++){
    if(array[i] > max) max = array[i];
  }
  int time = 0;
  while(max > 0){
    max = max/10;
    time++;
  }
  
  ArrayList<ArrayList<Integer>> queue = new ArrayList<>();
  for(int i = 0; i < 10; i++){
    ArrayList<Integer> queue1 = new ArrayList<>();
    queue.add(queue1);
  }
  
  for(int i = 0; i < time; i++){
    for(int anArray: array){
      int x = anArray % (int)Math.pow(10, i+1)/(int)Math.pow(10, i);
      ArrayList<Integer> queue2 = queue.get(x);
      queue2.add(anArray);
      queue.set(x, queue2);
    }
    int count = 0;
    for(int k = 0; k < 10; k++){
      while(queue.get(k).size() > 0){
        ArrayList<Integer> queue3 = queue.get(k);
        array[count] = queue3.get(0);
        queue3.remove(0);
        count++;
      }
    }
  }
