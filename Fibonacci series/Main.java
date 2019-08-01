#include<stdio.h>
int main()
{
  int n,first=0,second=1,i,third;
  scanf("%d",&n);
  printf("0 1 ");
  for(i=0;i<n-2;i++)
  {     
    third=first +second;
    first=second;
    second=third;
    printf("%d ",third);
  }
  return 0;
}