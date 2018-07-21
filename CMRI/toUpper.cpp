#include "stdio.h"
#include "conio.h"

void uppers(char * s, char * us){
  for(; *s != '\0'; s++, us++){
    if(*s >= 'a' && *s <= 'z'){
      *us = *s-32;
    }else{
      *us = *s;
    }
  }
  *us = '\0';
}
