#include<stdio.h>
int main()
{
  int i;
  scanf("%d",&i);
  if(i%4==0 && i%100!=0)
  printf("Leap year");
  else
     printf("Not Leap year");
  return 0;
}