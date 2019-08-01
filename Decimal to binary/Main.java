#include<stdio.h>
int main()
{
  int n,rem_count=0,a[128],i;
  scanf("%d",&n);
  while(n!=0)
  {
    a[rem_count++]=n%2;
    n=n/2;
  }
  for(i=rem_count-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  return 0;
}