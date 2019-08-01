#include<stdio.h>
#include<math.h>
int main()
{
  float x,y,z,t;
  scanf("%f %f",&x,&y);
  z= x*x + y*y;
  t=sqrt(z);
  printf("%.2f",t);
  return 0;
}