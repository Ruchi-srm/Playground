#include<stdio.h>
int main()
{
  int a,arr[20],s,i;
  scanf("%d",&a);
  for(i=0;i<a;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&s);
  for(i=0;i<a;i++)
  {
    if(arr[i]==s)
    {
      printf("%d",i+1);
      break;
    }
    else if(i==a-1 && arr[i]!=s)
    {
      printf("%d isn't present in the array.",s);
    }
      
  }
  return 0;
}