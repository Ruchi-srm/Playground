#include <stdio.h>

int main()
{ 
    int x,y,z;
  char c;
  scanf("%d%c %d%c %d%c",&x,&c,&y,&c,&z,&c);
  if(x>y && x>z)
    printf("%d",x);
  else if(y>x && y>z)
    printf("%d",y);
  else
    printf("%d",z);
}