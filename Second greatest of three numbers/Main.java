#include<stdio.h>
int main()
{
  int x,y,z;
  scanf("%d %d %d",&x,&y,&z);
  if(x>y && x>z)
  {
    if(y>z)
      printf("%d",y);
    else
      printf("%d",z);
  }
  else if(y>z && y>x)
  {
    if(x>z)
      printf("%d",x);
    else
      printf("%d",z);
  }
  else
  {
    if(x>y)
      printf("%d",x);
    else
      printf("%d",y);
  }
}