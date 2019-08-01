#include<stdio.h>
int main()
{
  int x,y,i,gcd,small,lcm;
  scanf("%d %d",&x,&y);
  small = x<y?x:y;
  for(i=small;i>0;i--)
  {
    if(x%i==0 && y%i==0)
    {
      gcd=i;
      break;
    }
  }
  lcm=(x*y)/gcd;
  printf("%d",lcm);
  return 0;
}