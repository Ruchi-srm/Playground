#include<stdio.h>
int main()
{
	int x,n;
  scanf("%d",&x);
  if(x%2==0)
  {
    n=x/2;
    printf("%d",n-1);
  }
  else
  {
    printf("%d",x-1);
  }
	
}