#include<stdio.h>
void main()
{
  float r,q,l;
  scanf("%f %f", &r,&q);
  l=2*3.14*r*(q/360);
  printf("%.2f",l);
}