// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
   int x,y,i;
  scanf("%d %d",&x,&y);
  if(x<y)
  {
     for(i=x;i>0;i--)
     {
       if(x%i==0 && y%i==0)
       {
         printf("%d",i);
         break;
       }
     }
  }
  else if(y<x)
  {
    for(i=y;i>0;i--)
     {
       if(x%i==0 && y%i==0)
       {
         printf("%d",i);
         break;
       }
     }
  }
  else
  {
    for(i=y;i>0;i--)
     {
       if(x%i==0 && y%i==0)
       {
         printf("%d",i);
         break;
       }
     }
  }
    
  
   return 0;
}