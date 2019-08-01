#include<stdio.h>
#include<string.h>
int main()
{
   char a[200];
  int i,count=1;
  gets(a);
  //printf("%s",a);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==' ')
      count++;
    else
      continue;
  }
  printf("%d",count);
  
}