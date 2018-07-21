unsigned char isP(long n){
  long i, temp;
  i = n;
  temp = 0;
  while(i > temp){
    temp += i%10;
    i /= 10;
  }
  return (i == temp || i == temp/10);
}
