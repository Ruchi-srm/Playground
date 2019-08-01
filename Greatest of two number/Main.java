#include<stdio.h>
int main()
{
  int i,j;
  scanf("%d %d",&i,&j);
  if(i>j)
  printf("num1 is the greatest");
  else if(j>i)
    printf("num2 is the greatest");
  else
    printf("Both number Equal");
  return 0;
}