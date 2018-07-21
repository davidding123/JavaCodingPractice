unsigned char isP(long n){
  if(n < 0 || (n != 0 && n %10 == 0)) return 0;
  long i, temp;
  i = n;
  temp = 0;
  while(i > temp){
    temp += i%10;
    i /= 10;
  }
  return (i == temp || i == temp/10)?1:0;
}
