int Func(int * a, int n){
  int index = 0;
  if(n <= 0) return index;
  for(int i = 0; i < n; i++){
    if(a[i] != 0) a[index++] = a[i];
  }
  for(int i = index; i < n; i++) a[i] = 0;
  return index;
}
