#include<stdio.h>
int main()
{
  int n,rem_count=0,a[128],i;
  scanf("%d",&n);
  while(n!=0)
  {
    a[rem_count++]=n%8;
    n=n/8;
  }
  for(i=rem_count-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  return 0;
}