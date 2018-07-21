#include "stdio.h"

void Func(){
int ans = 0;
for(int i = 0; i <= 100; i+=5){
ans += (i+2)/2;
}
cout << ans << end;
}
