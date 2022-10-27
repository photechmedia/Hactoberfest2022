#include <stdio.h>
int main()
{
   int n,i,j,flag;
   
   printf("Enter a range : ");
   scanf("%d",&n);
   
   for(i=2;i<n;i++)
   {
      flag=0;
      for(j=2;j*j<=i;j++)
      {
         if(i%j == 0)
            flag=1;
            break;
      }
      if(flag==0)
         printf("%d\t",i);
   }
    return 0;
}
