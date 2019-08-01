#include<stdio.h>
int main()
{
  	int arr[20],i,n,x,y,f=-1,g=-1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d %d",&x,&y);
  for(i=0;i<n;i++)
  {
    if(x==arr[i]  && f==-1)
    {   
      f=i;
    }
    else if(y==arr[i] && g==-1)
      g=i;
  }
  printf("Element 1 index = %d\n",f);
  printf("Element 2 index = %d\n",g);
     
}