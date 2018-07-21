#include "stdio.h"
#include "conio.h"

struct stu{
  char name [20];
  char sex;
  int no;
  int age;
  struct stu * next;
} * linkedList;

struct stu * createList(int n){
  int i;
  struct stu * h, *p, *s;
  h = (struct stu *)malloc(sizeof(struct stu));
  h -> next = NULL;
  p = h;
  for(int i = 0; i < n; i++){
    s = (struct stu *)malloc(sizeof(struct stu));
    p -> next = s;
    printf("info\n");
    scanf("%s %c %d %d", s->name, s->sex, s->no, s->ageA);
    s->next = NULL;
    p = s;
    return h;
  }

  void deleteList(struct stu * s, int a){
    struct stu * p；
    while(s -> age != a){
      p = s;
      s = s->next;
      if(s == NULL) printf("Reaching end");
      else{
        p -> next = s -> next;
      }
    }
    
    void display(struct stu * s){
      s = s->next;
      while(s != null){
        printf("%s %c %d %d\n", s->name, s->sex, s->no, s->age);
        s = s->next;
      }
      
      int main(){
        struct stu * s;
        int n, age;
        scanf("%d", &n);
        s = createList(n);
        display(s);
        scanf(%d, &age);
        deleteList(s, age);
        display(s);
        return 0;
      }
      
      
