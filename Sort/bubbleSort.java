public void bubble(int [] r, int n){
  int i = n - 1;
  while(i > 0){
    int pos = 0;
    for(int j = 0; j < i; j++){
      if(r[j] > r[j+1]）{
        pos = j;
        int tmp = r[j];
        r[j] = r[j+1];
        r[j+1] = tmp;
      }
         i = pos;
         }
         }
