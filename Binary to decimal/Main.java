#include<stdio.h>
#include<math.h>
int main()
{
  long int n;
  int i,count=0,a[100],sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
    a[count++]=n%10;
    n=n/10;
  }
  for(i=count-1;i>=0;i--)
  {
    sum=(sum+(a[i]*pow(2,i)));
  }
  printf("%d",sum);
  return 0;
}