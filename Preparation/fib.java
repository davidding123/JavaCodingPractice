public static int fibonacci(int n){
  if( n <= 1) return 1;
  int last = 1;
  int nextToLast = 1;
  int answer = 1;
  for(int i = 2; i <= n; i++){
    answer = last + nextTolast;
    nextToLast = last;
    last = answer;
  }
  return answer;
}
